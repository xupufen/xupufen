<template>
  <view class="app">
    <view class="video">
      <video autoplay="true" loop="true" muted="true" playsinline src="../../static/login.mp4" controls="false" style="pointer-events: none;" />
    </view>
  </view>
</template>

<script setup>
import {ref} from 'vue'

const login = ref({
  user: '',
  password: ''
})
</script>

<style lang="scss">
.app {
  border: 1px solid red;
  width: 100%;
  height: 95vh;
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  position: relative;

  .video {
    border: 1px solid red;
    position: absolute;
    width: 100%;
    height: 100%;
    top: 0;
    left: 0;
    overflow: hidden;
    video{
      border: 1px solid red;
      width: 100%;
      height: 100%;
      z-index: 1;
      object-fit: cover;
      transform: scaleY(1.2);
      transform-origin: center;
    }
  }
}
</style>