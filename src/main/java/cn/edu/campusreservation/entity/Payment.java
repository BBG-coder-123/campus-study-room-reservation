package cn.edu.campusreservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@TableName("payment")
public class Payment {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;
    private Long reservationId;
    private BigDecimal amount;
    private String paymentMethod;
    private String status;
    private String remark;
    private LocalDateTime createTime;
}
