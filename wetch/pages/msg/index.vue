<template>
  <view class="app">
    <view class="obj" v-for="(item,index) in msg" :key="index">
      <view class="l">
        <image src="/static/image/test.png"/>
      </view>
      <view class="r">
        <view class="title">
          <text>{{ item.title }}</text>
        </view>
        <view class="info">
          <text>{{ item.info }}</text>
        </view>
      </view>
    </view>
  </view>
</template>

<script setup>
import {ref} from 'vue'

const msg = ref([
  {
    title: '在线咨询',
    info: '暂时没消息'
  },
  {
    title: '在线咨询',
    info: '暂时没消息'
  },
  {
    title: '在线咨询',
    info: '暂时没消息'
  },
  {
    title: '在线咨询',
    info: '暂时没消息'
  }
])
</script>

<style scoped lang="scss">
.app {
  height: calc(100vh);
  width: 100%;
  //border: 1px solid red;
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  background: rgb(232, 235, 237);
  overflow-y: scroll;
  scrollbar-width: none;
  align-items: center;

  .obj {
    //border: 1px solid red;
    margin-top: 20px;
    width: 95%;
    min-height: 130px;
    border-radius: 6px;
    background: white;
    display: flex;
    //flex-direction: column;
    overflow: hidden;

    .l{
      //border: 1px solid red;
      width: 30%;
      height: 100%;
      display: flex;
      justify-content: flex-start;
      align-items: center;

      image{
        //border: 1px solid red;
        width: 60px;
        height: 60px;
        margin-left: 20px;
      }
    }

    .r {
      display: flex;
      flex-direction: column;
      height: 100%;
      //border: 1px solid red;
      width: 70%;

      .title {
        //border: 1px solid red;
        width: 100%;
        height: 50%;
        display: flex;
        justify-content: flex-start;
        align-items: flex-end;
      }

      .info {
        //border: 1px solid red;
        width: 100%;
        height: 50%;
        display: flex;
        justify-content: flex-start;
        align-items: flex-start;
        margin-top: 5px;
      }
    }
  }
}
</style>