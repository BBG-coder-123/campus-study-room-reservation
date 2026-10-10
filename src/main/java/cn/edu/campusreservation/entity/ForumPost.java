package cn.edu.campusreservation.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("forum_post")
public class ForumPost {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long userId;
    private String category;
    private String title;
    private String content;
    private String image;
    private Integer status;
    private Integer viewCount;
    private Integer likes;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
