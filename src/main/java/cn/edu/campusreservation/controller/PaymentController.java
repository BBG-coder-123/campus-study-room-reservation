package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping
    public Result<String> list() {
        return Result.success("支付记录模块骨架");
    }

    @PostMapping
    public Result<String> create() {
        return Result.success("支付模块骨架");
    }
}
