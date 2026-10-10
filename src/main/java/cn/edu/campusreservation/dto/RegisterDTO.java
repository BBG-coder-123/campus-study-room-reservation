package cn.edu.campusreservation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterDTO {
    @NotBlank(message = "用户名不能为空")
    @Size(min = 3, max = 20, message = "用户名长度需在 3 到 20 个字符之间")
    private String username;

    @NotBlank(message = "密码不能为空")
    @Size(min = 6, max = 20, message = "密码长度需在 6 到 20 个字符之间")
    private String password;

    @NotBlank(message = "真实姓名不能为空")
    private String realName;

    @NotBlank(message = "手机号不能为空")
    private String phone;

    @Email(message = "邮箱格式不正确")
    private String email;

    private String grade;
    private String major;
}
