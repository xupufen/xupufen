<template>
	<div class="app">
		
	</div>
</template>

<script setup>
import { ref } from 'vue'
const login = ref({
	user: '',
	password: ''
})
</script>

<style lang="scss">
	.app{
		border: 1px solid red;
		width: 100%;
		height: 95vh;
		box-sizing: border-box;
		display: flex;
		flex-direction: column;
		position: absolute;
		top: 0;
		left: 0;
	}
</style>