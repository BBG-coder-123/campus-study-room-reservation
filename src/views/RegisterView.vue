<template>
  <div class="page auth-page">
    <el-card class="auth-card" shadow="never">
      <h2>注册</h2>
      <el-form label-width="90px">
        <el-form-item label="用户名">
          <el-input placeholder="用户名" />
        </el-form-item>
        <el-form-item label="真实姓名">
          <el-input placeholder="真实姓名" />
        </el-form-item>
        <el-form-item label="手机号">
          <el-input placeholder="手机号" />
        </el-form-item>
        <el-form-item label="密码">
          <el-input type="password" placeholder="密码" show-password />
        </el-form-item>
        <el-form-item>
          <el-button type="primary" style="width: 100%">注册</el-button>
        </el-form-item>
      </el-form>
    </el-card>
  </div>
</template>

<script setup>
import { ElButton, ElCard, ElForm, ElFormItem, ElInput } from 'element-plus'
</script>

<style scoped>
.auth-page {
  min-height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
  background: #f4f6fb;
}

.auth-card {
  width: 460px;
  padding: 12px;
}
</style>
