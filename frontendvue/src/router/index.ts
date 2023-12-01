import { createRouter, createWebHistory } from 'vue-router'
// @ts-ignore
import Homepage from '../views/Homepage.vue'
import Otravista from '../views/Otravista.vue'
// @ts-ignore
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Homepage
    },
    {
      path: '/otravista',
      name: 'otravista',
      component: Otravista
    }
  ]
})

export default router
