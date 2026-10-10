package cn.edu.campusreservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("seat_swap_request")
public class SeatSwapRequest {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;
    private Long reservationId;
    private Long originalSeatId;
    private Long targetSeatId;
    private String reason;
    private String status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
