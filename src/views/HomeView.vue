<template>
  <div class="page home-page">
    <h1>校园自习室预约系统</h1>
    <p>欢迎使用前后端分离的校园座位预约系统</p>
    <div class="actions">
      <router-link to="/login">
        <el-button type="primary">登录</el-button>
      </router-link>
      <router-link to="/register">
        <el-button>注册</el-button>
      </router-link>
      <router-link to="/study-rooms">
        <el-button type="success">查看自习室</el-button>
      </router-link>
      <router-link to="/dashboard">
        <el-button type="warning">管理员后台</el-button>
      </router-link>
    </div>
  </div>
</template>

<script setup>
import { ElButton } from 'element-plus'
</script>

<style scoped>
.home-page {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background: linear-gradient(135deg, #eef4ff 0%, #f8fbff 100%);
}

h1 {
  font-size: 2.5rem;
  margin-bottom: 16px;
}

.actions {
  display: flex;
  gap: 16px;
  margin-top: 20px;
  flex-wrap: wrap;
}
</style>
