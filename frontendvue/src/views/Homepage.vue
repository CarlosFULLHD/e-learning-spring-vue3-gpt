<template>
  <section
    class="hero bg-cover bg-center p-20 text-center text-white"
    style="background-image: url('../assets/anime-classroom.jpg')"
  >
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
          <div class="bg-gray shadow rounded p-6">
            <h1 class="text-white text-6xl font-bold mb-4">¡Bienvenido a E-Learning!</h1>
            <p class="text-lg">
              ¡Bienvenidos a E-Learning App! Nuestra plataforma innovadora está diseñada para
              transformar la experiencia de aprendizaje en línea, combinando tecnología de
              vanguardia con una interfaz amigable y accesible. Construida sobre Spring Boot y
              Vue.js 3 y embellecida con TailwindCSS, nuestra plataforma se destaca por su
              integración con la inteligencia artificial a través de la API del chat GPT, ofreciendo
              asistencia interactiva y personalizada.
            </p>
            <br />
            <div class="mb-4">
              <label class="text-white block text-xl font-bold mb-2" for="query">
                ¿Cuéntanos qué te gustaría aprender?
              </label>
              <p class="text-lg italic">
                Pregunta lo que te gustaria aprender a futuro, nos gustaria conocerte y ayudarte en
                tu camino
              </p>

              <!-- Importamos el chat gpt -->
              <Gptpreguntasyrespuestas
                initial-system-message="Cuando te pregunte por algo me responderas con la importancia de las habilidades blandas a lo que el necesita aprender y que pasara si no las aprendo"
                placeholder-message="Hola soy Carlos, me gustaria en el futuro ser programador de videojuegos en una empresa como Riot Games"
              ></Gptpreguntasyrespuestas>

              <!-- Sección Principal -->

              <h2 class="text-4xl font-bold mb-6">La Revolución en Aprendizaje en Línea</h2>
              <p>
                Transforma tu experiencia educativa con tecnología de vanguardia y asistencia
                inteligente.
              </p>

              <!-- Tecnologías Utilizadas -->
              <section id="features" class="p-10 text-center">
                <h3 class="text-3xl font-bold mb-6">Tecnologías Utilizadas</h3>
                <div class="flex justify-center space-x-10">
                  <div class="hover:scale-110 transition transform duration-300 max-w-xs">
                    <img src="../assets/spring.png" alt="Spring boot" />
                    <p>Spring Boot</p>
                  </div>
                  <div class="hover:scale-110 transition transform duration-300 max-w-xs">
                    <img src="../assets/vur.png" alt="VUE JS" />
                    <p>Vue.js 3</p>
                  </div>
                  <div class="hover:scale-110 transition transform duration-300 max-w-xs">
                    <img src="../assets/tailwind.png" alt="tailwind" />
                    <p>TailwindCSS</p>
                  </div>
                  <div class="hover:scale-110 transition transform duration-300 max-w-xs">
                    <img src="../assets/auth0.png" alt="Auth0" />
                    <p>Auth0</p>
                  </div>
                </div>
              </section>
              <section id="contact" class="p-10 text-center">
                <h3 class="text-3xl font-bold mb-6">Contacta con Nosotros</h3>
                <!-- Formulario de contacto o información de contacto -->
              </section>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
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
