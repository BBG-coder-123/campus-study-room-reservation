package cn.edu.campusreservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("seat")
public class Seat {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long roomId;
    private String seatCode;
    private Integer rowNo;
    private Integer colNo;
    private Integer hasPower;
    private Integer hasNetwork;
    private String status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
