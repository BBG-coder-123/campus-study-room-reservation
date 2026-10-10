<template>
  <div class="page room-page">
    <el-container>
      <el-header>
        <h2>自习室列表</h2>
      </el-header>
      <el-main>
        <el-row :gutter="20">
          <el-col :span="8" v-for="item in 6" :key="item">
            <el-card shadow="hover">
              <template #header>
                <div class="card-header">
                  <span>教学楼 A-{{ item }}</span>
                  <el-tag type="success">开放中</el-tag>
                </div>
              </template>
              <p>位置：图书馆东侧</p>
              <p>容量：{{ 30 + item * 10 }}</p>
              <p>设施：空调 / 插座 / WiFi</p>
              <el-button type="primary">查看详情</el-button>
            </el-card>
          </el-col>
        </el-row>
      </el-main>
    </el-container>
  </div>
</template>

<script setup>
import { ElButton, ElCard, ElCol, ElContainer, ElHeader, ElMain, ElRow, ElTag } from 'element-plus'
</script>

<style scoped>
.room-page {
  padding: 20px;
}

.card-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
</style>
