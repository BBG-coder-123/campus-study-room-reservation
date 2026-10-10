# 校园自习室预约管理系统

这是一个基于 Spring Boot 3 + Vue 3 的前后端分离校园自习室预约系统，适合课程设计、毕业设计、全栈学习与二次开发。

## 项目简介

本项目围绕高校自习室预约与座位管理场景展开，覆盖学生端和管理员端两类角色。

- 学生端：注册登录、查看自习室、预约座位、支付、取消预约、投诉、论坛发帖、留言、点赞、座位调换等
- 管理端：用户管理、自习室管理、座位管理、预约审核、投诉处理、公告管理、论坛管理、支付管理、收费标准、统计分析等

## 技术栈

- 后端：Spring Boot 3
- ORM：MyBatis-Plus
- 安全：Spring Security + JWT
- 数据库：MySQL 8
- 前端：Vue 3 + Vite + Pinia + Vue Router + Element Plus
- 构建工具：Maven / Vite

## 项目结构

```text
campus-study-room-reservation/
├─ backend/                  # 后端项目（Spring Boot 3）
├─ frontend/                 # 前端项目（Vue 3）
├─ db/
│  ├─ schema.sql             # 数据库表结构
│  └─ data.sql              # 初始化数据
├─ README.md
└─ docs/
   └─ 项目说明.md
```

## 后端启动

```bash
cd backend
mvn clean package
mvn spring-boot:run
```

默认访问地址：

- http://localhost:8080

## 前端启动

```bash
cd frontend
npm install
npm run dev
```

默认访问地址：

- http://localhost:5173

## 默认账号

- 管理员：admin / 123456
- 学生演示：student001 / 123456

## 说明

本项目为骨架项目模板，适合二次开发扩展为完整毕业设计系统。后续可继续完善各个业务模块、数据库关联、分页查询、权限控制与图片上传等功能。
