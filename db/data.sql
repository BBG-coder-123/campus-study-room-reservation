-- 初始化基础演示数据
INSERT INTO user (username, password, real_name, phone, email, role, status, blacklisted, points)
VALUES
('student001', '$2a$10$D4B7M8Yv2oUb4qf7m6K7Ce6Kdfb7M3QxXxQnPrAtzxGIjfw8rE7n2', '张三', '13800100001', 'zhangsan@campus.edu', 'USER', 1, 0, 120),
('student002', '$2a$10$D4B7M8Yv2oUb4qf7m6K7Ce6Kdfb7M3QxXxQnPrAtzxGIjfw8rE7n2', '李四', '13800100002', 'lisi@campus.edu', 'USER', 1, 0, 80),
('student003', '$2a$10$D4B7M8Yv2oUb4qf7m6K7Ce6Kdfb7M3QxXxQnPrAtzxGIjfw8rE7n2', '王五', '13800100003', 'wangwu@campus.edu', 'USER', 1, 0, 40);

INSERT INTO forum_post (user_id, category, title, content, status, view_count, likes)
VALUES
(2, '学习交流', '今天自习室怎么预约更方便？', '大家有什么经验可以交流一下？', 1, 128, 18),
(3, '校园生活', '推荐一号自习室的靠窗座位', '很安静，适合复习和写作业。', 1, 95, 12);

INSERT INTO complaint (user_id, room_id, seat_id, complaint_type, title, content, status)
VALUES
(2, 1, 1, '设备问题', '插座无法使用', 'A-01 座位插座无电，无法充电。', 'PENDING');

INSERT INTO reservation (user_id, room_id, seat_id, reservation_date, time_slot, remark, amount, status, payment_status)
VALUES
(2, 1, 1, CURDATE(), '18:00-20:00', '复习专业课', 4.00, 'APPROVED', 'PAID'),
(3, 2, 4, DATE_ADD(CURDATE(), INTERVAL 1 DAY), '09:00-11:00', '准备期中复习', 4.00, 'PENDING', 'UNPAID');
