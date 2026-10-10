DROP DATABASE IF EXISTS campus_reservation;
CREATE DATABASE campus_reservation CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE campus_reservation;

-- 用户表
CREATE TABLE user (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    real_name VARCHAR(50) DEFAULT NULL,
    phone VARCHAR(20) DEFAULT NULL,
    email VARCHAR(100) DEFAULT NULL,
    avatar VARCHAR(255) DEFAULT NULL,
    grade VARCHAR(50) DEFAULT NULL,
    major VARCHAR(100) DEFAULT NULL,
    role VARCHAR(20) NOT NULL DEFAULT 'USER',
    status INT NOT NULL DEFAULT 1,
    blacklisted INT NOT NULL DEFAULT 0,
    points INT NOT NULL DEFAULT 0,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 自习室表
CREATE TABLE study_room (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(255) NOT NULL,
    capacity INT NOT NULL,
    facilities VARCHAR(255) DEFAULT NULL,
    opening_time VARCHAR(20) DEFAULT '08:00',
    closing_time VARCHAR(20) DEFAULT '22:00',
    max_reservation_hours INT DEFAULT 4,
    status VARCHAR(20) NOT NULL DEFAULT 'OPEN',
    description VARCHAR(500) DEFAULT NULL,
    image VARCHAR(255) DEFAULT NULL,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 座位表
CREATE TABLE seat (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    room_id BIGINT NOT NULL,
    seat_code VARCHAR(50) NOT NULL,
    row_no INT DEFAULT 1,
    col_no INT DEFAULT 1,
    has_power INT DEFAULT 1,
    has_network INT DEFAULT 1,
    status VARCHAR(20) NOT NULL DEFAULT 'AVAILABLE',
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    KEY idx_room_id (room_id)
);

-- 预约表
CREATE TABLE reservation (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    room_id BIGINT NOT NULL,
    seat_id BIGINT NOT NULL,
    reservation_date DATE NOT NULL,
    time_slot VARCHAR(50) NOT NULL,
    remark VARCHAR(255) DEFAULT NULL,
    amount DECIMAL(10,2) DEFAULT 0.00,
    status VARCHAR(20) NOT NULL DEFAULT 'PENDING',
    payment_status VARCHAR(20) NOT NULL DEFAULT 'UNPAID',
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    KEY idx_user_id (user_id),
    KEY idx_room_id (room_id),
    KEY idx_seat_id (seat_id)
);

-- 公告表
CREATE TABLE notice (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    image VARCHAR(255) DEFAULT NULL,
    published INT NOT NULL DEFAULT 1,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 投诉表
CREATE TABLE complaint (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    room_id BIGINT DEFAULT NULL,
    seat_id BIGINT DEFAULT NULL,
    complaint_type VARCHAR(50) NOT NULL,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    reply TEXT DEFAULT NULL,
    status VARCHAR(20) NOT NULL DEFAULT 'PENDING',
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 论坛帖子表
CREATE TABLE forum_post (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    category VARCHAR(50) NOT NULL,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    image VARCHAR(255) DEFAULT NULL,
    status INT NOT NULL DEFAULT 1,
    view_count INT NOT NULL DEFAULT 0,
    likes INT NOT NULL DEFAULT 0,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 论坛评论表
CREATE TABLE forum_comment (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    post_id BIGINT NOT NULL,
    user_id BIGINT NOT NULL,
    parent_id BIGINT DEFAULT NULL,
    content TEXT NOT NULL,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    KEY idx_post_id (post_id)
);

-- 支付记录表
CREATE TABLE payment (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    reservation_id BIGINT NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    payment_method VARCHAR(50) DEFAULT 'ALIPAY',
    status VARCHAR(20) NOT NULL DEFAULT 'SUCCESS',
    remark VARCHAR(255) DEFAULT NULL,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP
);

-- 收费规则表
CREATE TABLE pricing_rule (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    rule_name VARCHAR(100) NOT NULL,
    unit_price DECIMAL(10,2) NOT NULL,
    discount DECIMAL(10,2) DEFAULT 1.00,
    description VARCHAR(255) DEFAULT NULL,
    start_time VARCHAR(20) DEFAULT '08:00',
    end_time VARCHAR(20) DEFAULT '22:00',
    enabled INT NOT NULL DEFAULT 1,
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 座位调换请求表
CREATE TABLE seat_swap_request (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id BIGINT NOT NULL,
    reservation_id BIGINT NOT NULL,
    original_seat_id BIGINT NOT NULL,
    target_seat_id BIGINT NOT NULL,
    reason VARCHAR(255) DEFAULT NULL,
    status VARCHAR(20) NOT NULL DEFAULT 'PENDING',
    create_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 插入默认管理员
INSERT INTO user (username, password, real_name, phone, email, role, status, blacklisted, points)
VALUES ('admin', '$2a$10$D4B7M8Yv2oUb4qf7m6K7Ce6Kdfb7M3QxXxQnPrAtzxGIjfw8rE7n2', '管理员', '13800000000', 'admin@campus.edu', 'ADMIN', 1, 0, 0);

-- 插入示例自习室
INSERT INTO study_room (name, location, capacity, facilities, opening_time, closing_time, max_reservation_hours, status, description)
VALUES
('一号自习室', '图书馆一楼', 60, '空调,插座,WiFi', '08:00', '22:00', 4, 'OPEN', '适合考试复习与个人学习'),
('二号自习室', '图书馆二楼', 80, '空调,插座,WiFi,投影', '08:00', '22:00', 4, 'OPEN', '多人学习区'),
('三号自习室', '教学楼南区', 40, '空调,WiFi', '09:00', '21:00', 3, 'OPEN', '安静自习区');

-- 插入示例座位
INSERT INTO seat (room_id, seat_code, row_no, col_no, has_power, has_network, status)
VALUES
(1, 'A-01', 1, 1, 1, 1, 'AVAILABLE'),
(1, 'A-02', 1, 2, 1, 1, 'AVAILABLE'),
(1, 'A-03', 1, 3, 1, 1, 'AVAILABLE'),
(2, 'B-01', 1, 1, 1, 1, 'AVAILABLE'),
(2, 'B-02', 1, 2, 1, 1, 'AVAILABLE'),
(3, 'C-01', 1, 1, 1, 1, 'AVAILABLE');

-- 插入收费规则
INSERT INTO pricing_rule (rule_name, unit_price, discount, description, start_time, end_time, enabled)
VALUES
('工作日普通时段', 2.00, 1.00, '工作日正常教学时段价格', '08:00', '18:00', 1),
('工作日晚间优惠', 1.50, 0.75, '晚间时段优惠', '18:00', '22:00', 1),
('周末专享', 1.80, 0.90, '周末使用价格', '09:00', '21:00', 1);

-- 公告示例
INSERT INTO notice (title, content, published)
VALUES
('自习室开放通知', '本学期自习室已恢复正常开放，欢迎同学们预约使用。', 1),
('座位预约规则说明', '每位同学可预约最多连续4小时，逾时请提前续时。', 1);
