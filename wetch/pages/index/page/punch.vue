<template>
  <view class="app">
    <view class="title">
      <text>旅游打卡中心(基于spring boot技术)</text>
    </view>

    <view class="info">
      <view class="l">
        <image :src="info.avatar"/>
      </view>
      <view class="r">
        <view class="t">
          <text>{{ info.name }}</text>
        </view>
        <view class="b">
          <text>旅游打卡小程序打卡规则</text>
          <view class="span"> (查看规则)</view>
        </view>
      </view>
    </view>

    <view class="obj">
      <view class="top">
        <view class="left">
          <text>当前位置: 贵阳市观山湖区</text>
        </view>
        <view class="right">
          <text>当前时间:</text>
          <text style="color: rgba(1,150,252,0.85)">{{ time }}</text>
        </view>
      </view>
      <view class="bottom">
        <view class="item">
          <view class="ra">
            <text>开始打卡 !</text>
          </view>
          <view class="text">
            <text>旅途风光无限,点击开始记录您的美好生活</text>
          </view>
        </view>
      </view>
    </view>
  </view>
</template>

<script setup>
import {ref, onMounted} from 'vue'
import {dateFormat} from '@/utils'

onMounted(async () => {
  info.value = uni.getStorageSync('info')
  getTime()
})

const info = ref({})

const time = ref()

const getTime = () => {
  setInterval(() => {
    time.value = dateFormat(new Date())
  }, 1000)
}
</script>

<style scoped lang="scss">
.app {
  //border: 1px solid red;
  width: 100%;
  height: 100vh;
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  background: rgb(30, 30, 30);
  align-items: center;

  .title {
    //border: 1px solid red;
    width: 100%;
    height: 60px;
    display: flex;
    justify-content: flex-start;
    align-items: center;
    background: rgb(60, 60, 60);

    text {
      color: white;
      margin: 0 20px;
    }
  }

  .info {
    //border: 1px solid red;
    width: 90%;
    height: 80px;
    display: flex;
    margin-top: 10px;
    background: rgb(60, 60, 60);
    border-radius: 18px;

    .l {
      //border: 1px solid red;
      width: 80px;
      display: flex;
      justify-content: center;
      align-items: center;
      box-sizing: border-box;
      padding: 10px;

      image {
        //border: 1px solid red;
        width: 100%;
        height: 100%;
        border-radius: 10px;
      }
    }

    .r {
      //border: 1px solid red;
      width: calc(100% - 80px);
      display: flex;
      flex-direction: column;
      padding: 10px;

      .t {
        //border: 1px solid red;
        width: 100%;
        height: 50%;
        display: flex;
        justify-content: flex-start;
        align-items: flex-start;
        color: white;
        font-size: 18px;
      }

      .b {
        //border: 1px solid red;
        width: 100%;
        height: 50%;
        display: flex;
        justify-content: flex-start;
        align-items: flex-end;
        color: white;
        font-size: 14px;

        text {
          //border: 1px solid red;
          width: 60%;
          display: flex;
        }

        .span {
          width: 40%;
          //border: 1px solid red;
          color: rgb(2, 161, 253);
        }
      }
    }
  }

  .obj {
    //border: 1px solid red;
    width: 90%;
    height: calc(100% - 80px - 160px);
    margin-top: 10px;
    background: rgb(60, 60, 60);
    border-radius: 18px;
    display: flex;
    flex-direction: column;

    .top {
      //border: 1px solid red;
      width: 100%;
      height: 80px;
      margin-top: 10px;
      padding: 5px;
      box-sizing: border-box;
      display: flex;
      justify-content: space-between;
      align-items: flex-end;

      .left {
        //border: 1px solid red;
        width: 48%;
        height: 100%;
        background: rgba(211, 203, 203, 0.56);
        border-radius: 8px;
        display: flex;
        justify-content: flex-start;
        align-items: center;
        color: white;

        text {
          margin-left: 15px;
          font-size: 14px;
        }
      }

      .right {
        //border: 1px solid red;
        width: 48%;
        height: 100%;
        background: rgba(211, 203, 203, 0.56);
        border-radius: 8px;
        display: flex;
        justify-content: center;
        align-items: center;
        color: white;
        flex-direction: column;

        text {
          //margin-left: 15px;
          font-size: 14px;
          //border: 1px solid red;
          width: 100%;
          margin: 8px 0 0 15px;
          display: flex;
          //justify-content: center;
          align-items: center;
        }
      }
    }

    .bottom {
      //border: 1px solid red;
      width: 100%;
      height: calc(100% - 90px);
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;

      .item {
        //border: 1px solid red;
        height: 250px;
        width: 250px;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;

        .ra {
          //border: 1px solid red;
          width: 60%;
          height: 60%;
          border-radius: 50%;
          background: rgb(1, 150, 252);
          display: flex;
          justify-content: center;
          align-items: center;
          color: white;
        }

        .text {
          margin-top: 20px;
          color: white;
          font-size: 12px;
        }
      }
    }
  }
}
</style>