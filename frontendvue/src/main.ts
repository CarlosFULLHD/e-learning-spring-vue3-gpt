import { createApp } from 'vue';
import App from './App.vue';
import './assets/main.css'
import { createAuth0 } from '@auth0/auth0-vue';
import { createPinia } from 'pinia';
import router from './router';
const app = createApp(App);
app.use(createPinia())
app.use(
    createAuth0({
        domain: 'dev-jeywrhtt14xy56is.us.auth0.com',
        clientId: 'TBanqzi5VrjC5YEluhQCEr5wzBn9dE8L',
        authorizationParams: {
            redirect_uri: window.location.origin,
        },
    })
);
app.use(router)
app.mount('#app');
