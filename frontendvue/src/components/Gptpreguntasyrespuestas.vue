<template>
  <div class="relative p-4 m-0 h-screen from-purple-400 via-pink-500 to-red-500 w-full">
    <div class="bg-gray shadow rounded p-6">
      <div class="mb-4">
        <div class="messages space-y-2 overflow-y-auto max-h-none">
          <div
            v-for="(message, index) in filteredChatHistory"
            :key="index"
            class="p-3 rounded-lg"
            :class="{
              'user-message': message.role === 'user',
              'assistant-message': message.role === 'assistant'
            }"
          >
            <span
              class="inline-block p-2 rounded-lg text-gray-950"
              :class="message.role === 'user' ? 'bg-blue-500 text-white' : 'bg-gray-200'"
            >
              {{ message.content }}
            </span>
          </div>
        </div>

        <div class="input-area mt-4 flex">
          <input
            class="text-white flex-grow p-2 border rounded-l-lg focus:outline-none focus:ring focus:border-blue-300"
            id="query"
            v-model="userQuery"
            @keyup.enter="sendQuery"
            type="text"
            :disabled="isInputDisabled"
            :placeholder="placeholderMessage"
          />
        </div>
      </div>
      <div class="mb-4">
        <button @click="sendQuery" class="btn btn-primary rounded-r-lg">Enviar</button>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import { ref, computed, onMounted, defineProps } from 'vue'
import axios from 'axios'

export default {
  props: {
    initialSystemMessage: {
      type: String,
      default: ''
    },
    placeholderMessage: {
      type: String,
      default: 'Me gustaria aprender programacion de video juegos' // Valor por defecto
    }
  },

  setup(props) {
    const { initialSystemMessage } = props
    const userQuery = ref('')
    const chatHistory = ref([
      {
        role: 'system',
        content:
          'Cuando te pregunte por algo me responderas con la importancia de las habilidades blandas a lo que el necesita aprender y que pasara si no las aprendo'
      }
    ])
    const isLoading = ref(false)
    const isInputDisabled = ref(false)
    const systemMessage = ref('') //para manejar el mensaje del sistema internamente
    const filteredChatHistory = computed(() => {
      return chatHistory.value.filter((_, index) => index !== 0)
    })
    onMounted(async () => {
      if (initialSystemMessage) {
        systemMessage.value = initialSystemMessage
      } else {
        await obtenerTema()
      }
    })

    const obtenerTema = async () => {
      try {
        const response = await axios.get('https://localhost:8080/api/v1/obtenertema')
        const tema = response.data // Asumiendo que la respuesta es el tema directamente
        chatHistory.value.push({
          role: 'system',
          content: `Cuando te pregunte por algo me responderas sobre ${tema} y su importancia.`
        })
      } catch (error) {
        console.error('Error al obtener el tema:', error)
        chatHistory.value.push({
          role: 'system',
          content: 'Error al cargar el tema, por favor intenta de nuevo.'
        })
      }
    }

    const sendQuery = async () => {
      if (isInputDisabled.value) return // Desactivado hasta que se obtenga respuesta
      isLoading.value = true
      isInputDisabled.value = true
      chatHistory.value.push({ role: 'user', content: userQuery.value })
      chatHistory.value.push({ role: 'assistant', content: 'Cargando...' })
      try {
        const messagesToSend = [...chatHistory.value]
        if (systemMessage.value) {
          messagesToSend.unshift({ role: 'system', content: systemMessage.value })
        }
        const response = await axios.post(
          'https://api.openai.com/v1/chat/completions',
          {
            messages: chatHistory.value,
            model: 'gpt-3.5-turbo'
          },
          {
            headers: {
              Authorization: `Bearer ${import.meta.env.VITE_OPENAI_API_KEY}`,
              'Content-Type': 'application/json'
            }
          }
        )
        // Reemplaza el ultimo mensaje (cargando) con la respuesta real
        chatHistory.value[chatHistory.value.length - 1] = {
          role: 'assistant',
          content: response.data.choices[0].message.content
        }
      } catch (error) {
        console.error('Error al enviar la consulta:', error)
        chatHistory.value[chatHistory.value.length - 1] = {
          role: 'assistant',
          content: 'Error al obtener la respuesta.'
        }
      } finally {
        isLoading.value = false
        isInputDisabled.value = false
        userQuery.value = '' // Limpiar el campo después de enviar la consulta
      }
    }

    return {
      userQuery,
      chatHistory,
      sendQuery,
      isLoading,
      filteredChatHistory
    }
  }
}
</script>
