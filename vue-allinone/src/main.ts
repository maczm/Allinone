import {createApp} from "vue"
import "./style.css"
import App from "./App.vue"
import ElementPlus from "element-plus"
import "element-plus/dist/index.css"
import zhCn from "element-plus/es/locale/lang/zh-cn"
import {router} from "./router";

const app = createApp(App);
app.use(ElementPlus, {size: "small", locale: zhCn})
app.use(router)
app.mount("#app")