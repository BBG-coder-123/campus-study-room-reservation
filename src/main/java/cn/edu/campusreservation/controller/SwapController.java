package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/swaps")
public class SwapController {

    @GetMapping
    public Result<String> list() {
        return Result.success("座位调换请求模块骨架");
    }

    @PostMapping
    public Result<String> create() {
        return Result.success("发起座位调换模块骨架");
    }
}
