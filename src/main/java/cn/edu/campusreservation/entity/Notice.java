package cn.edu.campusreservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("notice")
public class Notice {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String title;
    private String content;
    private String image;
    private Integer published;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
