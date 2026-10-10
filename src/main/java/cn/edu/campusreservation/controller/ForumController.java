package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/forum")
public class ForumController {

    @GetMapping("/posts")
    public Result<String> listPosts() {
        return Result.success("论坛帖子列表模块骨架");
    }

    @PostMapping("/posts")
    public Result<String> createPost() {
        return Result.success("发布帖子模块骨架");
    }
}
