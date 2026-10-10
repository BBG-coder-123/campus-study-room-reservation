package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/complaints")
public class ComplaintController {

    @GetMapping
    public Result<String> list() {
        return Result.success("投诉列表模块骨架");
    }

    @PostMapping
    public Result<String> create() {
        return Result.success("新增投诉模块骨架");
    }
}
