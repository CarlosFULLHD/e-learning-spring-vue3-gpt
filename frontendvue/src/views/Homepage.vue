<template>
  <div class="relative p-4 m-0 h-screen from-purple-400 via-pink-500 to-red-500 w-full">
    <!-- Imagen de fondo -->
    <!-- <img
      src="@/assets/anime-classroom.jpg"
      alt="E-Learning"
      class="absolute top-0 left-0 w-full h-full object-cover"
    /> -->

    <!-- Contenido encima de la imagen -->
    <div class="min-h-screen p-10 bg-cover bg-center">
      <div class="mx-auto">
        <div class="bg-white shadow rounded p-6">
          <h1 class="text-2xl font-bold mb-4">¡Bienvenido a E-Learning!</h1>
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="query">
              ¿Cuéntanos qué te gustaría aprender?
            </label>
            <div class="messages">
              <div
                v-for="(message, index) in chatHistory"
                :key="index"
                class="message"
                :class="{
                  'user-message': message.role === 'user',
                  'assistant-message': message.role === 'assistant'
                }"
              >
                <div>{{ message.content }}</div>
              </div>
            </div>

            <div class="input-area">
              <input
                class="query-input shadow appearance-none border rounded w-full py-2 px-3 text-white leading-tight focus:outline-none focus:shadow-outline"
                id="query"
                v-model="userQuery"
                @keyup.enter="sendQuery"
                type="text"
                placeholder="me gustaria aprender programacion de video juegos"
              />
            </div>
          </div>
          <div class="mb-4">
            <button @click="sendQuery" class="btn btn-primary">Enviar</button>
          </div>
        </div>
      </div>
    </div>
    <div class="relative z-10">
      <h1 class="text-2xl font-bold mb-4 text-white">¡Bienvenido a E-Learning!</h1>
    </div>
  </div>
</template>

<script lang="ts">
import axios from 'axios'
import { ref } from 'vue'

export default {
  name: 'Homepage',
  setup() {
    const userQuery = ref('') // Se usa para vincular el campo de texto de entrada
    const chatHistory = ref([
      // Se usa para mantener el historial de la conversación
      {
        role: 'system',
        content:
          'Eres un docente profesional que enseña habilidades blandas, el usuario te hablara sobre que le gustaria aprender a el, le das la  importancia de estas habilidades blandas a lo que el necesita aprender y que pasara si no las aprende, tambien le invitas a leer nuestras membresias de pago abajo de la pagina y le das la bienvenida a "E learning app, tu plataforma de aprendizaje"'
      }
      // Añadir mensajes de "user" y "assistant" según sea necesario
    ])
    const isLoading = ref(false) // Indicador de carga

    // Esta función envía la consulta a la API de OpenAI y recibe la respuesta
    const sendQuery = async () => {
      isLoading.value = true

      // Añade el mensaje del usuario al historial de la conversación
      chatHistory.value.push({ role: 'user', content: userQuery.value })

      try {
        const response = await axios.post(
          'https://api.openai.com/v1/chat/completions',
          {
            messages: chatHistory.value,
            model: 'gpt-3.5-turbo'
          },
          {
            headers: {
              Authorization: `Bearer  ${process.env.VUE_APP_OPENAI_API_KEY}`,
              'Content-Type': 'application/json'
            }
          }
        )

        // Añade la respuesta del asistente al historial de la conversación
        const assistantMessage = response.data.choices[0].message.content
        chatHistory.value.push({ role: 'assistant', content: assistantMessage })

        // Limpia el campo de entrada para la próxima consulta
        userQuery.value = ''
      } catch (error) {
        console.error('Error al enviar la consulta:', error)
        // Manejo de errores, puedes añadir un mensaje de error al historial de la conversación si lo deseas
      } finally {
        isLoading.value = false
      }
    }

    return {
      userQuery,
      chatHistory,
      sendQuery,
      isLoading
    }
  }
}
</script>
