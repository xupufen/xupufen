import {request} from '@/api/request'

/**
 * 获取所有自取省市
 */
export const getAddress= ()=>{
    return request.get('/getAddress')
}