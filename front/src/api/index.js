import request from '@/util/request';

export function test(params) {

    /**
     * 根据id获取用户信息
     */
    return request({
        url: '/px-user/getUserInfo',
        method: 'post',
        data: params  
    })
}