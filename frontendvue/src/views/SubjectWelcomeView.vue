<script setup lang="ts">

</script>

<template>
  <div class="container mx-auto text-center p-6">
    <h1 class="text-4xl font-bold mb-4">Bienvenido al Curso</h1>
    <p class="text-md mb-8">Aquí va el por qué este curso es importante...</p>
    <div class="flex justify-center items-center mb-8">
      <h2 class="text-2xl font-semibold mr-4">Progreso:</h2>
      <img src="https://media.licdn.com/dms/image/D4E12AQF_ADYai3zlzQ/article-cover_image-shrink_720_1280/0/1695160618049?e=2147483647&v=beta&t=SzZ8MZollUnUN_nv1bzXxNTbbHsIMeKm16uXqIcPSnU" alt="Progreso del Curso" class="max-w-xs md:max-w-sm lg:max-w-md">
    </div>
    <router-link to="/subjectwelcome" class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded">
      Entrar
    </router-link>
  </div>
</template>
<style scoped>
</style>