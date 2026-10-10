<template>
  <div class="page dashboard-page">
    <el-container>
      <el-header>
        <h2>管理员后台</h2>
      </el-header>
      <el-main>
        <el-row :gutter="20">
          <el-col :span="6">
            <el-card>用户总数：128</el-card>
          </el-col>
          <el-col :span="6">
            <el-card>预约总数：462</el-card>
          </el-col>
          <el-col :span="6">
            <el-card>待审核：14</el-card>
          </el-col>
          <el-col :span="6">
            <el-card>投诉处理：5</el-card>
          </el-col>
        </el-row>
      </el-main>
    </el-container>
  </div>
</template>

<script setup>
import { ElCard, ElCol, ElContainer, ElHeader, ElMain, ElRow } from 'element-plus'
</script>

<style scoped>
.dashboard-page {
  padding: 20px;
}
</style>
