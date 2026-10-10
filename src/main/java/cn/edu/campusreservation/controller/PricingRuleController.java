package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pricing-rules")
public class PricingRuleController {

    @GetMapping
    public Result<String> list() {
        return Result.success("收费规则模块骨架");
    }

    @PostMapping
    public Result<String> create() {
        return Result.success("新增收费规则骨架");
    }
}
