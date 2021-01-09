import request from '@/util/request';

export function test(params) {

    return request({
        url: '/px/test',
        method: 'post',
        params: {
            name: '111'
        }        
    })
}