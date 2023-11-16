<template>
  <div id="app">
    <NavBar />
    <router-view />
    <Footer />
  </div>
</template>

<script lang="ts">
import { useAuth0 } from '@auth0/auth0-vue'
import { defineComponent } from 'vue'
import NavBar from '../../frontendvue/src/components/NavBar.vue'
import Footer from '../../frontendvue/src/components/Footer.vue'

export default defineComponent({
  name: 'App',
  components: {
    NavBar,
    Footer
  },
  setup() {
    const { loginWithRedirect, user, isAuthenticated } = useAuth0()

    return {
      login: () => {
        loginWithRedirect()
      },
      user,
      isAuthenticated
    }
  }
})
</script>
<!--
    Para mostrar datos de usuario
    <div>
      <h2>User Profile</h2>
      <button @click="login">Log in</button>
      <pre v-if="isAuthenticated">
        <code>{{ user }}</code>
      </pre>
    </div>
 -->
