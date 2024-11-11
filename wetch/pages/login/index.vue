<template>
  <view class="app">
    <view class="video">
      <video
          autoplay="true"
          loop="true"
          muted="true"
          playsinline src="../../static/login.mp4"
          controls="false"
          style="pointer-events: none;"/>
    </view>
    <view class="title">
      <text>Hi</text>
      <text>欢迎使用旅游打卡小程序</text>
    </view>

    <view class="login" v-if="loginStatus">
      <view class="userLogin" @click="loginStatus=!loginStatus">
        <text>账号密码登录</text>
      </view>
      <view class="codeLogin">
        <text>验证码登录</text>
      </view>
    </view>

    <view class="loginView" v-if="!loginStatus">
      <view class="t">账号密码登录</view>
      <view class="user">
        <input placeholder="请输入您的账号" v-model="login.user"/>
      </view>
      <view class="pwd">
        <input placeholder="请输入您的密码" v-model="login.password"/>
      </view>
      <view class="btn" @click="toLogin">登录</view>
    </view>
  </view>
</template>

<script setup>
import {ref} from 'vue'
import {request} from '../../api/request'

const login = ref({
  user: '',
  password: ''
})

const loginStatus = ref(true)
const msg = ref('')

const toLogin = async () => {
  const r = (await request.post('/login', {
    'user': login.value.user,
    'password': login.value.password
  })).data

  if (r.code !== 200) {
    msg.value = r.msg
  } else {
    msg.value = r.msg
    uni.redirectTo({
      url: '/pages/index/index'
    })
    localStorage.setItem('token',r.data)
  }
}
</script>

<style lang="scss">
.app {
  //border: 1px solid red;
  width: 100%;
  height: 95vh;
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  position: relative;
  align-items: center;

  .video {
    //border: 1px solid red;
    position: absolute;
    width: 100%;
    height: 100%;
    top: 0;
    left: 0;
    overflow: hidden;

    video {
      //border: 1px solid red;
      width: 100%;
      height: 100%;
      z-index: 1;
      object-fit: cover;
      transform: scaleY(1.2);
      transform-origin: center;
    }
  }

  .title {
    //border: 1px solid red;
    width: 80%;
    height: 80px;
    z-index: 2;
    margin-top: 80px;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    color: white;
    font-size: 24px;
    font-weight: bold;
  }

  .login {
    //border: 1px solid red;
    z-index: 2;
    width: 80%;
    height: 200px;
    margin-top: 120px;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;

    .userLogin {
      width: 100%;
      height: 50px;
      z-index: 2;
      background: white;
      border-radius: 8px;
      display: flex;
      align-items: center;
      justify-content: center;
      color: black;
      font-weight: bold;
      font-size: 20px;
    }

    .codeLogin {
      margin-top: 20px;
      width: 100%;
      height: 50px;
      z-index: 2;
      background: white;
      opacity: 0.7;
      border-radius: 8px;
      display: flex;
      align-items: center;
      justify-content: center;
      color: black;
      font-weight: bold;
      font-size: 20px;
      border: 2px solid white;
    }
  }

  .loginView {
    z-index: 2;
    //border: 1px solid red;
    width: 80%;
    height: 350px;
    display: flex;
    flex-direction: column;
    background: white;
    opacity: 0.6;
    border-radius: 8px;
    align-items: center;

    .t {
      margin-top: 20px;
      width: 100%;
      height: 40px;
      display: flex;
      justify-content: center;
      //border: 1px solid red;
      align-items: center;
      color: black;
      font-size: 24px;
    }

    .user {
      border: 1px solid red;
      width: 90%;
      margin-top: 30px;
      height: 50px;
      border-radius: 10px;

      input {
        //border: 1px solid red;
        width: 100%;
        height: 100%;
      }
    }

    .pwd {
      border: 1px solid red;
      width: 90%;
      margin-top: 20px;
      height: 50px;
      border-radius: 10px;

      input {
        //border: 1px solid red;
        width: 100%;
        height: 100%;
      }
    }

    .btn {
      //border: 1px solid red;
      width: 80%;
      margin-top: 40px;
      height: 50px;
      border-radius: 10px;
      display: flex;
      justify-content: center;
      align-items: center;
      font-size: 26px;
      background: rgb(5, 78, 230);
      color: white;
    }
  }
}
</style>