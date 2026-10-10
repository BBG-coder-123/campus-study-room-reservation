package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public Result<String> dashboard() {
        return Result.success("管理员仪表盘模块骨架");
    }
}
