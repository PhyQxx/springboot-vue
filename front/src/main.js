import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store'
import '@/assets/css/public.css'
import Element from 'element-ui'
import '@/assets/css/element-variables.scss'

Vue.use(Element)
Vue.config.productionTip = false;
new Vue({
    router,
    store: store,
    render: h => h(App)
  }).$mount('#app');
