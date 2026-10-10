package cn.edu.campusreservation.service;

import cn.edu.campusreservation.dto.LoginDTO;
import cn.edu.campusreservation.dto.RegisterDTO;
import cn.edu.campusreservation.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User register(RegisterDTO dto);
    String login(LoginDTO dto);
    User getByUsername(String username);
}
