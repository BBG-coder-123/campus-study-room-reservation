package cn.edu.campusreservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@TableName("reservation")
public class Reservation {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;
    private Long roomId;
    private Long seatId;
    private LocalDate reservationDate;
    private String timeSlot;
    private String remark;
    private BigDecimal amount;
    private String status;
    private String paymentStatus;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
