<template>
  <view class="app">
    <view class="top">
      <view class="avatar">
        <uv-avatar src="" size="60"/>
      </view>
      <view class="config">
        <view class="l">
          <view class="login">
            <text>登录/注册</text>
          </view>
          <view class="i">
            <text>相信美好,或许有一天,你所期待的会反过来拥抱你</text>
          </view>
        </view>
        <view class="c">
          <view class="setting">
            <image :src="set" />
          </view>
        </view>
      </view>
    </view>

    <view class="money">
      <view class="host">
        <text>我的收藏</text>
      </view>

      <view class="rr">
        <text>我的足迹</text>
      </view>
    </view>

    <view class="my"></view>

    <view class="love">
      <view class="p">
        <text>猜你喜欢</text>
        <view class="sx">
          <view class="icon">
            <image :src="sx" />
          </view>
          <text>换一批</text>
        </view>
      </view>

      <view class="it">
        <view class="item" v-for="(item,index) in 20">
        </view>

      </view>
    </view>
  </view>
</template>

<script setup>
import {ref} from 'vue'
import set from '@/static/svg/set.svg'
import sx from '@/static/svg/sx.svg'
</script>

<style scoped lang="scss">
.app {
  //border: 1px solid red;
  box-sizing: border-box;
  height: calc(100vh);
  display: flex;
  flex-direction: column;
  background: rgb(232, 235, 237);
  align-items: center;
  overflow-y: scroll;
  scrollbar-width: none;


  .top {
    //border: 1px solid red;
    width: 100%;
    min-height: 120px;
    display: flex;

    .avatar {
      //border: 1px solid red;
      width: 100px;
      height: 100%;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .config {
      //border: 1px solid red;
      width: calc(100% - 100px);
      height: 100%;
      display: flex;

      .l {
        //border: 1px solid red;
        width: 80%;
        height: 100%;
        display: flex;
        flex-direction: column;

        .login {
          //border: 1px solid red;
          height: 50%;
          width: 100%;
          display: flex;
          justify-content: flex-start;
          align-items: flex-end;
          font-size: 18px;
        }

        .i {
          //border: 1px solid red;
          height: 50%;
          width: 100%;
          font-size: 12px;
          display: flex;
          align-items: center;
          justify-content: flex-start;
        }
      }

      .c {
        //border: 1px solid red;
        width: 20%;
        height: 100%;
        display: flex;
        justify-content: center;
        align-items: center;

        .setting {
          //border: 1px solid red;
          width: 20px;
          height: 20px;
          //background: white;
          image{
            //border: 1px solid red;
            width: 100%;
            height: 100%;
          }
        }
      }
    }
  }

  .money {
    margin-top: 10px;
    //border: 1px solid red;
    width: 100%;
    min-height: 80px;
    display: flex;
    justify-content: space-evenly;

    .host {
      //border: 1px solid red;
      width: 48%;
      display: flex;
      border-radius: 6px;
      background: white;
      align-items: center;
      justify-content: center;
    }

    .rr {
      //border: 1px solid red;
      width: 48%;
      display: flex;
      border-radius: 6px;
      background: white;
      align-items: center;
      justify-content: center;
    }
  }

  .my {
    //border: 1px solid red;
    width: 97%;
    min-height: 150px;
    margin-top: 5px;
    display: flex;
    flex-wrap: wrap;
    background: white;
    border-radius: 6px;
  }

  .love {
    //border: 1px solid red;
    width: 100%;
    height: calc(100% - 450px);
    display: flex;
    box-sizing: border-box;
    padding: 5px;
    flex-direction: column;

    .p {
      //border: 1px solid red;
      width: 100%;
      height: 50px;
      display: flex;
      justify-content: space-between;
      align-items: center;

      text {
        font-size: 18px;
        font-weight: 550;
        color: rgb(51, 51, 51);
      }

      .sx {
        //border: 1px solid red;
        width: 100px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        height: 100%;

        .icon {
          //border: 1px solid red;
          width: 20px;
          height: 20px;
          //margin-left: 5px;
          //background: white;

          image{
            width: 100%;
            height: 100%;
          }
        }

        text {
          //border: 1px solid red;
          //margin-right: 5px;
        }
      }
    }

    .it {
      //border: 1px solid red;
      width: 100%;
      height: 350px;
      display: flex;
      flex-wrap: wrap;
      overflow-y: scroll;
      scrollbar-width: none;

      .item{
        //border: 1px solid red;
        width: 47%;
        height: 270px;
        background: white;
        border-radius: 5px;
        margin: 10px 5px;
      }
    }
  }
}
</style>