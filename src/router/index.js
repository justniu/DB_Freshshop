import Vue from 'vue'
import Router from 'vue-router'
import Users from '@/components/Users'
import Login from '@/components/Login'

Vue.config.productionTip = false
Vue.use(Router);

export default new Router({
  routes:[
      {
        path:'/login',
        name:'login',
        component:Login
      },
      {
          path:'/',
          name:'users',
          component:Users
      }
  ]
})