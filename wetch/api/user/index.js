import {request} from '@/api/request'

/**
 * 用户注册
 */
export const userRegister=(i)=>{
    return request.post('/register',{
        'user': i.user,
        'password': i.password,
        'sex': i.sex,
        'name': i.name,
        'email': i.email,
        'avatar': i.avatar
    })
}

/**
 * 获取用户信息
 * @parm id
 */
export const getInfo=(id)=>{
    return request.get('/info?id='+id)
}