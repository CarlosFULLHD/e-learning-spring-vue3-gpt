<template>
  <nav class="bg-gray-100 p-4">
    <div class="container mx-0 w-max">
      <div class="flex items-center justify-between space-x-40">
        <div>
          <!-- Logo y título -->
          <img
            src="@/assets/e-learning-icon.png"
            alt="E-Learning"
            class="h-8 w-8 inline-block mr-2"
          />
          <span class="font-bold text-xl">E-Learning</span>
        </div>
        <div>
          <!-- Buscador y menú -->
          <input type="text" placeholder="Buscar Cursos..." class="border p-2 rounded w-80" />
          <button
            class="ml-4 p-2 rounded bg-blue-500 text-white"
            href="https://dev-u564vq4dqtozr7z5.us.auth0.com/"
          >
            Iniciar Sesion
          </button>

          <!-- Agrega más botones según la necesidad -->
        </div>
      </div>
    </div>
  </nav>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'NavBar'
})
</script>
