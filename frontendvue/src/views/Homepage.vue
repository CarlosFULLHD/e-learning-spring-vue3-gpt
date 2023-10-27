<template>
  <div class="relative p-4 m-0 h-screen from-purple-400 via-pink-500 to-red-500 w-full">
    <!-- Imagen de fondo -->
    <img
      src="@/assets/anime-classroom.jpg"
      alt="E-Learning"
      class="absolute top-0 left-0 w-full h-full object-cover"
    />

    <!-- Contenido encima de la imagen -->
    <div class="relative z-10">
      <h1 class="text-2xl font-bold mb-4 text-white">¡Bienvenido a E-Learning!</h1>
      <!-- Aquí puedes añadir más contenido según la necesidad -->
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'Homepage'
})
</script>
