package cn.edu.campusreservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("study_room")
public class StudyRoom {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;
    private String location;
    private Integer capacity;
    private String facilities;
    private String openingTime;
    private String closingTime;
    private Integer maxReservationHours;
    private String status;
    private String description;
    private String image;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
