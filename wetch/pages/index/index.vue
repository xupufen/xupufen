<template>
  <view class="app">
    <view class="bj">
      <view class="obj">
        <view class="select">
          <input placeholder="搜索目的地/景点/省市"/>
        </view>
        <view class="bt">Go</view>
      </view>
    </view>

    <view class="item">
      <view class="i" v-for="(item,index) in item" :key="index">
          <image :src="item.icon"/>
          <text>{{item.name}}</text>
      </view>
    </view>

    <view class="images">
      <view class="o" v-for="(item,index) in images" :key="index">
        <image :src="item.i"/>
      </view>
    </view>

    <view class="nlp">
      <view class="t">
        <text>爆款主推</text>
      </view>
      <view class="con">

      </view>
    </view>
  </view>
</template>

<script setup>
import {ref} from 'vue'

const item = ref([
  {
    name: '贵州省专区',
    icon: ''
  },
  {
    name: '国内省市',
    icon: ''
  },
  {
    name: '定制计划',
    icon: ''
  },
  {
    name: '文旅中心',
    icon: ''
  },
  {
    name: '交通工具',
    icon: ''
  },
  {
    name: '门票',
    icon: ''
  },
  {
    name: '自由出行',
    icon: ''
  },
  {
    name: '酒店',
    icon: ''
  }
])

const images = ref([
  {
    i: ''
  },
  {
    i: ''
  }
])
</script>


<style scoped lang="scss">
.app {
  //border: 1px solid red;
  width: 100%;
  height: calc(95vh - 45px - 50px);
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  align-items: center;
  background: rgb(236, 241, 249);

  .bj {
    //border: 1px solid red;
    width: 100%;
    height: 280px;
    display: flex;
    flex-direction: column;
    background: url("../../static/index.jpg");
    background-size: cover;
    z-index: 1;

    .obj {
      display: flex;
      justify-content: flex-start;
      align-items: center;
      width: 100%;
      //border: 1px solid red;
      height: 60px;
      .select {
        margin-top: 20px;
        //border: 1px solid red;
        width: 75%;
        height: 40px;
        border-radius: 8px;
        margin-left: 10px;
        display: flex;
        justify-content: center;
        align-items: center;
        background: white;
        opacity: 0.8;

        input {
          width: 100%;
          height: 100%;
        }
      }

      .bt{
        //border: 1px solid red;
        width: 40px;
        height: 40px;
        margin-top: 20px;
        margin-left: 15px;
        border-radius: 50%;
        background: white;
        opacity: 0.8;
        display: flex;
        justify-content: center;
        align-items: center;
        color: blue;
      }
    }
  }

  .item{
    //border: 1px solid red;
    width: 90%;
    display: flex;
    justify-content: center;
    align-items: center;
    flex-wrap: wrap;
    height: 200px;
    margin-top: -90px;
    z-index: 2;
    background: white;
    border-radius: 10px;

    .i{
      //border: 1px solid red;
      width: calc(100% / 5);
      height: calc(100% / 2.5);
      margin: 0 5px;
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;

      image{
        //border: 1px solid red;
        width: 45px;
        height: 45px;
        background: blue;
        clip-path: circle(50% at 50% 50%);
      }

      text{
        margin-top: 5px;
        font-size: 12px;
      }
    }
  }

  .images{
    //border: 1px solid red;
    width: 99%;
    height: 85px;
    box-sizing: border-box;
    padding: 5px;
    display: flex;
    justify-content: space-evenly;
    align-items: center;

    .o{
      //border: 1px solid red;
      width: 47%;
      height: 100%;
      margin: 0 5px;
      border-radius: 8px;
      display: flex;
      justify-content: center;
      align-items: center;

      image{
        border: 1px solid red;
        width: 100%;
        height: 100%;
        border-radius: 8px;
      }
    }
  }

  .nlp{
    box-sizing: border-box;
    margin-top: 10px;
    border: 1px solid red;
    width: 100%;
    height: 350px;
    display: flex;
    flex-direction: column;

    .t{
      border: 1px solid red;
      width: 100%;
      height: 40px;
      display: flex;
      justify-content: flex-start;
      align-items: center;
      text{
        margin-left: 15px;
        font-weight: bold;
        font-size: 20px;
      }
    }

    .con{
      display: flex;
      border: 1px solid red;
      margin-top: 5px;
      width: 100%;
      height: calc(100% - 5px);
      overflow-x: scroll;
      scrollbar-width: none;
    }
  }
}
</style>
