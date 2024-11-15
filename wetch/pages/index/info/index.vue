<template>
  <view class="app">
    <view class="top">
      <view class="image">
        <image :src="data.i" />
      </view>

      <view class="title">
        <text>{{data.msg}}</text>
      </view>

    </view>
    <view class="bottom">
      <view class="l" @click="setStatus">
        <text>加入收藏</text>
        <image :src="status" />
      </view>

      <view class="btn">
        <view class="bt">
          <text>立即预定</text>
        </view>
      </view>

    </view>
  </view>
</template>

<script setup>
import {onLoad} from '@dcloudio/uni-app'
import {ref} from 'vue'
import sc from '@/static/svg/sc.svg'
import ysc from '@/static/svg/ysc.svg'

onLoad((option) => {
  data.value = JSON.parse(option.data)
  console.log(data.value)
})

const data = ref()

const status = ref(sc)

const setStatus = ()=>{
  if (status.value === sc){
    status.value = ysc
  }else {
    status.value = sc
  }
}
</script>

<style scoped lang="scss">
.app{
  //border: 1px solid red;
  width: 100%;
  height: 95vh;
  box-sizing: border-box;
  display: flex;
  flex-direction: column;

  .top{
    width: 100%;
    height: calc(100% - 70px);
    //border: 1px solid red;
    display: flex;
    flex-direction: column;
    overflow-y: scroll;
    scrollbar-width: none;

    .image{
      //border: 1px solid red;
      width: 100%;
      height: 250px;
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 0;

      image{
        width: 100%;
        height: 100%;
        margin: 0;
      }
    }

    .title{
      //border: 1px solid red;
      width: 100%;
      height: 80px;
      overflow-y: scroll;
      box-sizing: border-box;
      padding: 5px;
    }
  }

  .bottom{
    //border: 1px solid red;
    width: 100%;
    height: 70px;
    display: flex;
    justify-content: space-between;
    align-items: center;

    .l{
      //border: 1px solid red;
      width: 120px;
      display: flex;
      height: 100%;
      justify-content: space-evenly;
      align-items: center;

      image{
        //border: 1px solid red;
        height: 20px;
        width: 20px;
      }
    }

    .btn{
      //border: 1px solid red;
      width: calc(100% - 120px);
      height: 100%;
      display: flex;
      justify-content: center;
      align-items: center;
      box-sizing: border-box;
      .bt{
        //border: 1px solid red;
        width: 95%;
        height: 80%;
        border-radius: 25px;
        background: rgb(31, 154, 255);
        display: flex;
        justify-content: center;
        align-items: center;

        text{
          color: white;
          font-size: 20px;
          font-weight: bold;
        }
      }
    }
  }
}
</style>