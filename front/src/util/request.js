import axios from 'axios'

// 创建一个axios实例
const service = axios.create({
  headers: {
    // 'content-type': 'application/json;charset=UTF-8',
    // 'token': 'one' 
  },
  //服务器地址
  baseURL: 'http://192.168.0.104:8068',
  timeout: 5000
})

// 添加请求拦截器
service.interceptors.request.use(config => {
  // 在发送请求之前做某事，比如说 设置token
  // config.headers['token'] = 'token';
  return config;
}, error => {
  // 请求错误时做些事
  return Promise.reject(error);
});

// 添加响应拦截器
service.interceptors.response.use(response => {
  const res = response.data;
  console.log('成功', res);
  // 如果返回的状态不是200 就主动报错
  if(res.code !== 200){
    return Promise.reject(res.message || 'error')
  }
  return response;
}, error => {
  console.log('失败', res);
  return Promise.reject(error.response); // 返回接口返回的错误信息
})
export default service