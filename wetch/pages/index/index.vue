<template>
  <view class="app">
    <view class="bj">
      <image src="/static/index.jpg" class="b"/>
      <view class="obj">
        <view class="select">
          <input placeholder="搜索目的地/景点/省市"/>
        </view>
        <view class="bt">Go</view>
      </view>
    </view>

    <view class="item">
      <view class="i" v-for="(i,index) in item" :key="index">
        <image :src="i.icon"/>
        <text>{{ i.name }}</text>
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
        <view class="icon" v-for="(item,index) in info" :key="index" @click="toPage(item)">
          <view class="image">
            <image :src="item.i"/>
          </view>
          <view class="info">
            <text>{{item.msg}}</text>
          </view>
        </view>
      </view>
    </view>
  </view>
</template>

<script setup>
import {ref} from 'vue'
import test from '/static/image/test.png'
import gz from '@/static/index/gz.svg'
import gn from '@/static/index/gn.svg'
import jh from '@/static/index/jh.svg'
import wl from '@/static/index/wl.svg'
import jt from '@/static/index/jt.svg'
import mp from '@/static/index/mp.svg'
import cx from '@/static/index/cx.svg'
import jd from '@/static/index/jd.svg'

const item = ref([
  {
    name: '贵州省专区',
    icon: gz
  },
  {
    name: '国内省市',
    icon: gn
  },
  {
    name: '旅游打卡',
    icon: jh
  },
  {
    name: '文旅中心',
    icon: wl
  },
  {
    name: '交通工具',
    icon: jt
  },
  {
    name: '门票',
    icon: mp
  },
  {
    name: '自由出行',
    icon: cx
  },
  {
    name: '酒店',
    icon: jd
  }
])

const images = ref([
  {
    i: test
  },
  {
    i: test
  }
])

const info = ref([
  {
    i: test,
    msg: '三亚景点的旅游元素大致分为玩海，雨林，人文和打卡景点。\n' +
        '              玩海可以去四大海湾（三亚湾、大东海、亚龙湾和海棠湾\n' +
        '              ），还可以去三大海岛（蜈支洲岛、分界洲岛、西岛），更可以跟随户外俱乐部去那些人少景美还有漂亮海底风景的私人岛屿野营、浮潜（比如加井岛）。\n' +
        '              热带雨林也主要有三个，鸟巢背山面海得天独厚景观一流；槟榔谷自然人文相得益彰让人难忘；而呀诺达则以壮阔的山景取胜，但也略显单调。\n' +
        '              人文景点有三亚千古情、南山和大小洞天，这东西见仁见智，推荐度不高。\n' +
        '              而打卡景点是天涯海角和鹿回头，天涯海角更胜在有强大的象征意义，而鹿回头的夕阳和夜景倒是相当值得一看。'
  },
  {
    i: test,
    msg: '三亚景点的旅游元素大致分为玩海，雨林，人文和打卡景点。\n' +
        '              玩海可以去四大海湾（三亚湾、大东海、亚龙湾和海棠湾\n' +
        '              ），还可以去三大海岛（蜈支洲岛、分界洲岛、西岛），更可以跟随户外俱乐部去那些人少景美还有漂亮海底风景的私人岛屿野营、浮潜（比如加井岛）。\n' +
        '              热带雨林也主要有三个，鸟巢背山面海得天独厚景观一流；槟榔谷自然人文相得益彰让人难忘；而呀诺达则以壮阔的山景取胜，但也略显单调。\n' +
        '              人文景点有三亚千古情、南山和大小洞天，这东西见仁见智，推荐度不高。\n' +
        '              而打卡景点是天涯海角和鹿回头，天涯海角更胜在有强大的象征意义，而鹿回头的夕阳和夜景倒是相当值得一看。'
  },
  {
    i: test,
    msg: '三亚景点的旅游元素大致分为玩海，雨林，人文和打卡景点。\n' +
        '              玩海可以去四大海湾（三亚湾、大东海、亚龙湾和海棠湾\n' +
        '              ），还可以去三大海岛（蜈支洲岛、分界洲岛、西岛），更可以跟随户外俱乐部去那些人少景美还有漂亮海底风景的私人岛屿野营、浮潜（比如加井岛）。\n' +
        '              热带雨林也主要有三个，鸟巢背山面海得天独厚景观一流；槟榔谷自然人文相得益彰让人难忘；而呀诺达则以壮阔的山景取胜，但也略显单调。\n' +
        '              人文景点有三亚千古情、南山和大小洞天，这东西见仁见智，推荐度不高。\n' +
        '              而打卡景点是天涯海角和鹿回头，天涯海角更胜在有强大的象征意义，而鹿回头的夕阳和夜景倒是相当值得一看。'
  },
  {
    i: test,
    msg: '三亚景点的旅游元素大致分为玩海，雨林，人文和打卡景点。\n' +
        '              玩海可以去四大海湾（三亚湾、大东海、亚龙湾和海棠湾\n' +
        '              ），还可以去三大海岛（蜈支洲岛、分界洲岛、西岛），更可以跟随户外俱乐部去那些人少景美还有漂亮海底风景的私人岛屿野营、浮潜（比如加井岛）。\n' +
        '              热带雨林也主要有三个，鸟巢背山面海得天独厚景观一流；槟榔谷自然人文相得益彰让人难忘；而呀诺达则以壮阔的山景取胜，但也略显单调。\n' +
        '              人文景点有三亚千古情、南山和大小洞天，这东西见仁见智，推荐度不高。\n' +
        '              而打卡景点是天涯海角和鹿回头，天涯海角更胜在有强大的象征意义，而鹿回头的夕阳和夜景倒是相当值得一看。'
  }, {
    i: test,
    msg: '三亚景点的旅游元素大致分为玩海，雨林，人文和打卡景点。\n' +
        '              玩海可以去四大海湾（三亚湾、大东海、亚龙湾和海棠湾\n' +
        '              ），还可以去三大海岛（蜈支洲岛、分界洲岛、西岛），更可以跟随户外俱乐部去那些人少景美还有漂亮海底风景的私人岛屿野营、浮潜（比如加井岛）。\n' +
        '              热带雨林也主要有三个，鸟巢背山面海得天独厚景观一流；槟榔谷自然人文相得益彰让人难忘；而呀诺达则以壮阔的山景取胜，但也略显单调。\n' +
        '              人文景点有三亚千古情、南山和大小洞天，这东西见仁见智，推荐度不高。\n' +
        '              而打卡景点是天涯海角和鹿回头，天涯海角更胜在有强大的象征意义，而鹿回头的夕阳和夜景倒是相当值得一看。'
  },
])

const toPage = (i) => {
  uni.navigateTo({
    url: `/pages/index/info/index?data=${JSON.stringify(i)}`
  })
}
</script>


<style scoped lang="scss">
.app {
  //border: 1px solid red;
  width: 100%;
  height: calc(100vh);
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
    //background: url("../../static/index.jpg");
    background-size: cover;
    z-index: 1;

    .b{
      //border: 1px solid red;
      width: 100%;
      height: 280px;
      z-index: 1;
      position: absolute;
      left: 0;
      top: 0;
    }

    .obj {
      display: flex;
      justify-content: flex-start;
      align-items: center;
      width: 100%;
      //border: 1px solid red;
      height: 60px;
      z-index: 2;

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

      .bt {
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

  .item {
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

    .i {
      //border: 1px solid red;
      width: calc(100% / 5);
      height: calc(100% / 2.5);
      margin: 0 5px;
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;

      image {
        display: flex;
        justify-content: center;
        align-items: center;
        //border: 1px solid red;
        width: 45px;
        height: 45px;
        //background: blue;
        clip-path: circle(50% at 50% 50%);
      }

      text {
        margin-top: 5px;
        font-size: 12px;
      }
    }
  }

  .images {
    //border: 1px solid red;
    width: 99%;
    height: 85px;
    box-sizing: border-box;
    padding: 5px;
    display: flex;
    justify-content: space-evenly;
    align-items: center;

    .o {
      //border: 1px solid red;
      width: 47%;
      height: 100%;
      margin: 0 5px;
      border-radius: 8px;
      display: flex;
      justify-content: center;
      align-items: center;

      image {
        //border: 1px solid red;
        width: 100%;
        height: 100%;
        border-radius: 8px;
      }
    }
  }

  .nlp {
    box-sizing: border-box;
    margin-top: 10px;
    //border: 1px solid red;
    width: 100%;
    height: 350px;
    display: flex;
    flex-direction: column;

    .t {
      //border: 1px solid red;
      width: 100%;
      height: 40px;
      display: flex;
      justify-content: flex-start;
      align-items: center;

      text {
        margin-left: 15px;
        font-weight: bold;
        font-size: 20px;
      }
    }

    .con {
      display: flex;
      //border: 1px solid red;
      margin-top: 5px;
      width: 100%;
      height: calc(100% - 5px);
      overflow-x: auto;
      scrollbar-width: none;
      box-sizing: border-box;
      padding: 10px;

      .icon {
        display: flex;
        flex-direction: column;
        //border: 1px solid red;
        min-width: calc(200px - 10px) !important;
        height: 100%;
        background: white;
        border-radius: 8px;
        margin-left: 10px;
      }

      .image {
        //border: 1px solid red;
        width: 100%;
        height: 80%;
        display: flex;
        justify-content: center;
        align-content: center;
        border-radius: 6px;

        image {
          //border: 1px solid red;
          width: 100%;
          height: 100%;
          border-radius: 6px;
        }
      }

      .info {
        //border: 1px solid red;
        width: 100%;
        height: 20%;
        overflow: auto;
      }
    }
  }
}
</style>
