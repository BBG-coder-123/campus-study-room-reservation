package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/seats")
public class SeatController {

    @GetMapping
    public Result<String> list(@RequestParam(required = false) Long roomId) {
        return Result.success("座位列表模块骨架，roomId=" + roomId);
    }

    @PostMapping
    public Result<String> create() {
        return Result.success("新增座位骨架");
    }
}
