// vue 路由
import {createRouter, createWebHashHistory} from 'vue-router'

const routes = [
    {
        path: '/',
        name: 'home',
        component: () => import('@/views/Index.vue'),
        meta: {
            title: '首页'
        },
    }
]
export const router = createRouter({
    history: createWebHashHistory(),
    routes,
})