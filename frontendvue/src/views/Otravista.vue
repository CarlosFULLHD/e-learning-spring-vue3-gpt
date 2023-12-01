<template>
  <Gptpreguntasyrespuestas
    initial-system-message="Cuando te pregunte por algo me responderas con precision a la pregunta del usuario y "
  ></Gptpreguntasyrespuestas>
</template>
<script lang="ts">
import { defineComponent } from 'vue'
import Gptpreguntasyrespuestas from '../components/Gptpreguntasyrespuestas.vue'

export default defineComponent({
  name: 'Homepage',
  components: {
    Gptpreguntasyrespuestas
  }
})
</script>
