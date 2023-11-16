<template>
  <div class="flex flex-col min-h-screen">
    <!-- Contenido principal de la página -->
    <div class="flex-grow">
      <!-- Aquí va el contenido de tu página -->
      <div class="container mx-auto p-4">
        <!-- Contenido de la página -->
      </div>
    </div>

    <!-- Pie de página -->
    <footer class="bg-gray-200 p-4">
      <div class="container mx-auto text-center">
        <p>Copyright © 2023 E-Learning</p>
        <a href="#" class="text-blue-500">Contacto</a>
      </div>
    </footer>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'Layout',
})
</script>

<style scoped>
/* Puedes agregar estilos específicos para este componente aquí si es necesario */
</style>
