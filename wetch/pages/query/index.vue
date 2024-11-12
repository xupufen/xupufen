<template>
	<view class="app">
		<view class="swapper">
			<swiper :indicator-dots="true" :autoplay="true" :interval="3000" :duration="1000">
				<swiper-item v-for="(item,index) in list" :key="index">
					<view class="swiper-item">
						<image :src="item" mode=""></image>
					</view>
				</swiper-item>
			</swiper>
		</view>

		<view class="title">
			<text class="t">我的附近</text>
			<view class="address">
				<view class="a">贵阳</view>
			</view>
		</view>

		<view class="obj"></view>

	</view>
</template>

<script setup>
	import {
		ref
	} from 'vue'

	const list = ref([
		'https://cdn.uviewui.com/uview/swiper/swiper3.png',
		'https://cdn.uviewui.com/uview/swiper/swiper2.png',
		'https://cdn.uviewui.com/uview/swiper/swiper1.png',
		'https://cdn.uviewui.com/uview/swiper/swiper3.png',
		'https://cdn.uviewui.com/uview/swiper/swiper2.png',
		'https://cdn.uviewui.com/uview/swiper/swiper1.png'
	])
</script>

<style scoped lang="scss">
	.app {
		//border: 1px solid red;
		width: 100%;
		height: calc(100vh);
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
		background: rgb(232, 235, 237);

		.swapper {
			//border: 1px solid red;
			width: 100%;
			height: 200px;
			display: flex;
			justify-content: center;
			align-items: center;
			box-sizing: border-box;
			overflow: hidden;

			swiper {
				//border: 1px solid red;
				width: 100%;
				height: 100%;
			}
			
			.swiper-item{
				//border: 1px solid red;
        width: 100%;
        height: 100%;

        image{
          width: 100%;
          height: 100%;
        }
			}
		}

		.title {
			//border: 1px solid red;
			width: 100%;
			height: 45px;
			margin-top: 10px;
			display: flex;
			justify-content: space-between;
			align-items: center;
			border-radius: 8px;
			overflow: hidden;
			background: white;

			.t {
				//border: 1px solid red;
				width: 90px;
				height: 100%;
				display: flex;
				justify-content: center;
				align-items: center;
				font-weight: bold;
				font-size: 18px;
				color: rgba(51, 51, 51, 0.87);
			}


			.address {
				//border: 1px solid red;
				display: flex;
				width: 100px;
				justify-content: center;
				height: 100%;
				align-items: center;
			}
		}

		.obj {
			//border: 1px solid red;
			width: 100%;
			height: calc(100% - 240px);
			box-sizing: border-box;
		}
	}
</style>