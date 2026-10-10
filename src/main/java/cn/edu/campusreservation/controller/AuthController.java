package cn.edu.campusreservation.controller;

import cn.edu.campusreservation.common.Result;
import cn.edu.campusreservation.dto.LoginDTO;
import cn.edu.campusreservation.dto.RegisterDTO;
import cn.edu.campusreservation.entity.User;
import cn.edu.campusreservation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public Result<User> register(@RequestBody @Valid RegisterDTO dto) {
        return Result.success(userService.register(dto));
    }

    @PostMapping("/login")
    public Result<String> login(@RequestBody @Valid LoginDTO dto) {
        return Result.success(userService.login(dto));
    }
}
