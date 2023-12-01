<template>
  <nav class="bg-gradient-to-r from-blue-500 to-purple-500 p-4 shadow-lg">
    <div class="container mx-auto flex justify-between items-center">
      <div class="flex items-center justify-between space-x-10">
        <div>
          <img
            src="@/assets/e-learning-icon.png"
            alt="E-Learning"
            class="h-16 w-16 inline-block mr-2 text-zinc-50"
          />
          <span class="font-semibold text-xl text-white">E-Learning</span>
        </div>
        <div class="flex items-center space-x-4">
          <!-- Buscador y Navbar -->
          <input type="text" placeholder="Buscar Cursos..." class="input input-bordered" />
          <router-link
            to="/"
            class="ml-4 p-2 rounded bg-blue-500 text-white w-32 hover:bg-orange-500 transition-transform duration-300 transform hover:shadow-md"
          >
            Inicio
          </router-link>
          <router-link to="/subjects" class="ml-4 p-2 rounded bg-blue-500 text-white w-32 hover:bg-orange-500 transition-transform duration-300 transform hover:shadow-md">
            Cursos
          </router-link>
          <router-link to="/recursos" class="ml-4 p-2 rounded bg-blue-500 text-white w-32 hover:bg-orange-500 transition-transform duration-300 transform hover:shadow-md">
            Recursos
          </router-link>
          <div v-if="!isAuthenticated">
            <button
              class="btn btn-ghost text-white hover:bg-orange-500"
              href="https://dev-u564vq4dqtozr7z5.us.auth0.com/"
              @click="login"
            >
              <span class="mr-3">Iniciar Sesión</span>
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                strokeWidth="1.5"
                stroke="currentColor"
                class="h-8 w-8"
              >
                <path
                  strokeLinecap="round"
                  strokeLinejoin="round"
                  d="M17.982 18.725A7.488 7.488 0 0012 15.75a7.488 7.488 0 00-5.982 2.975m11.963 0a9 9 0 10-11.963 0m11.963 0A8.966 8.966 0 0112 21a8.966 8.966 0 01-5.982-2.275M15 9.75a3 3 0 11-6 0 3 3 0 016 0z"
                />
              </svg>
            </button>
          </div>
          <div v-if="isAuthenticated">
            <button
              class="ml-4 p-2 rounded bg-blue-500 text-white flex items-center hover:bg-orange-500 transition-transform duration-300 transform hover:shadow-md"
              href="https://dev-u564vq4dqtozr7z5.us.auth0.com/"
              @click="logout"
            >
              <span class="mr-3">Cerrar Sesión</span>
              <svg
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 24 24"
                strokeWidth="1.5"
                stroke="currentColor"
                class="h-8 w-8"
              >
                <path
                  strokeLinecap="round"
                  strokeLinejoin="round"
                  d="M15.75 9V5.25A2.25 2.25 0 0013.5 3h-6a2.25 2.25 0 00-2.25 2.25v13.5A2.25 2.25 0 007.5 21h6a2.25 2.25 0 002.25-2.25V15M12 9l-3 3m0 0l3 3m-3-3h12.75"
                />
              </svg>
            </button>
          </div>
          <!-- Nickname, Email y Avatar -->
          <div class="flex items-center" v-if="isAuthenticated">
            <div class="ml-2 p-1 flex flex-col text-white text-xs">
              <code class="text-white text-right">{{ user?.nickname }}</code>
              <code class="text-white">{{ user?.email }}</code>
            </div>
            <img
              v-if="user?.picture"
              :src="user?.picture"
              alt="Avatar"
              class="h-12 w-12 rounded-full ml-2"
            />
            <div
              v-else
              class="h-12 w-12 bg-white text-blue-500 rounded-full flex items-center justify-center ml-2"
            >
              <span>{{ user?.given_name?.charAt(0) }}{{ user?.family_name?.charAt(0) }}</span>
            </div>
          </div>
        </div>
      </div>
    </div>
  </nav>
</template>

<script lang="ts">
import { useAuth0 } from '@auth0/auth0-vue'
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'NavBar',
  setup() {
    const { logout } = useAuth0()
    const { loginWithRedirect, user, isAuthenticated } = useAuth0()
    return {
      login: () => {
        loginWithRedirect()
      },
      logout: () => {
        logout({ logoutParams: { returnTo: window.location.origin } })
      },
      user,
      isAuthenticated
    }
  }
})
</script>
