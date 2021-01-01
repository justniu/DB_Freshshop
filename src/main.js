import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios';
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.config.productionTip = false
Vue.use(ElementUI);
Vue.prototype.axios = axios;// 将axios挂载到prototype上，在组件中可以直接使用this.axios访问!!!!!!!!!!!!!
axios.defaults.baseURL = '/';

new Vue({
  el: '#app',
  router,
  render: h => h(App)
}).$mount('#app')
