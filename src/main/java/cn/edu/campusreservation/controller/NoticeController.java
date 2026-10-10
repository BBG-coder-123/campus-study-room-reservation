package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notices")
public class NoticeController {

    @GetMapping
    public Result<String> list() {
        return Result.success("公告列表模块骨架");
    }

    @PostMapping
    public Result<String> create() {
        return Result.success("发布公告模块骨架");
    }
}
