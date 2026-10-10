package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @GetMapping
    public Result<String> list() {
        return Result.success("预约列表模块骨架");
    }

    @PostMapping
    public Result<String> create() {
        return Result.success("创建预约模块骨架");
    }

    @PutMapping("/{id}/cancel")
    public Result<String> cancel(@PathVariable Long id) {
        return Result.success("取消预约，ID=" + id);
    }
}
