package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/study-rooms")
public class StudyRoomController {

    @GetMapping
    public Result<String> list() {
        return Result.success("自习室列表模块骨架");
    }

    @GetMapping("/{id}")
    public Result<String> detail(@PathVariable Long id) {
        return Result.success("自习室详情模块骨架，ID=" + id);
    }
}
