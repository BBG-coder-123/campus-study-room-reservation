package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users/profile")
    public Result<String> profile() {
        return Result.success("用户中心模块骨架");
    }
}
