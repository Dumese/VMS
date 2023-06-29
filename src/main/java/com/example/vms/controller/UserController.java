package com.example.vms.controller;

import com.example.vms.data.dto.UserLoginDTO;
import com.example.vms.data.vo.UserRegisterVO;
import com.example.vms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户注册
     * @param user 用户
     * @return session
     */
    @PostMapping("/register")
    public Object register(@RequestBody UserRegisterVO user){
        return userService.register(user);
    }

    /**
     * 用户登录
     * @param user 用户
     * @return session
     */
    @PostMapping("/login")
    public Object login(@RequestBody UserLoginDTO user){
        return userService.login(user);
    }
}
