/**
 * 是否登录
 */
export const isLogin=()=>{
    return uni.getStorageSync('token')!=null && uni.getStorageSync('token')!==undefined;
}

/**
 * 日期格式化
 */
export const dateFormat=(time)=>{
    const pad = (n) => (n < 10 ? '0' + n : n)
    return `${time.getFullYear()}-${pad(time.getMonth() + 1)}-${pad(time.getDate())} ` +
        `${pad(time.getHours())}:${pad(time.getMinutes())}:${pad(time.getSeconds())}`
}
