package cn.edu.campusreservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("complaint")
public class Complaint {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;
    private Long roomId;
    private Long seatId;
    private String complaintType;
    private String title;
    private String content;
    private String reply;
    private String status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
