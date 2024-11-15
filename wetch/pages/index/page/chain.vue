<template>
  <view class="app">
    <view class="l">
      <view class="item" v-for="(item,index) in data" :key="index">
        <view class="s" @click="getInfo(item)">
          <text>{{ item.address }}</text>
        </view>
      </view>
    </view>
    <view class="r">
      <view class="city" v-for="(item,index) in city" :key="index">
        <view class="sq">
          <text>{{ item.cityName }}</text>
        </view>
        <view class="zx">
          <text>{{ item.cityType }}</text>
        </view>
      </view>
    </view>
  </view>
</template>

<script setup>
import {ref, onMounted} from 'vue'
import {getAddress} from '@/api/address'

onMounted(async () => {
  data.value = (await getAddress()).data.data
})


const data = ref([])

const city = ref()

const getInfo = (i) => {
  for (const item of data.value){
    if (i.address === item.address){
      city.value = JSON.parse(i.city.match(/\[.*\]/)[0])
    }
  }
}
</script>


<style scoped lang="scss">
.app {
  //border: 1px solid red;
  width: 100%;
  height: 100vh;
  display: flex;
  justify-content: flex-start;
  background: rgb(208, 216, 221);

  .l {
    //border: 1px solid red;
    width: 150px;
    display: flex;
    overflow-y: scroll;
    flex-wrap: wrap;
    justify-content: center;

    .item {
      //border: 1px solid red;
      width: 90%;
      height: 40px;
      display: flex;
      margin: 10px 0;
      border-radius: 10px;
      background: white;

      .s {
        display: flex;
        justify-content: center;
        align-items: center;
        //border: 1px solid red;
        width: 100%;
        height: 100%;
      }
    }
  }

  .r {
    width: calc(100% - 150px);
    //border: 1px solid red;
    display: flex;
    overflow-y: scroll;
    flex-wrap: wrap;
    background: #2C405A;

    .city{
      //border: 1px solid red;
      width: 100%;
      height: 30px;
      border-radius: 5px;
      margin: 5px;
      display: flex;
      justify-content: center;
      align-items: center;

      .sq{
        //border: 1px solid red;
        font-size: 12px;
        width: 48%;
        height: 100%;
        display: flex;
        align-items: center;
        justify-content: center;
        border-radius: 5px  0  0 5px;
        background: white;
      }

      .zx{
        //border: 1px solid red;
        font-size: 12px;
        width: 48%;
        height: 100%;
        display: flex;
        align-items: center;
        justify-content: center;
        background: white;
        border-radius: 0  5px 5px 0;
      }
    }
  }
}
</style>
