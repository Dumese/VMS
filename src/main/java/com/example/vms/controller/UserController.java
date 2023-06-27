package com.example.vms.controller;

import com.example.vms.data.dto.UserLoginDTO;
import com.example.vms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(@RequestBody UserLoginDTO user){
        return userService.login(user);
    }
}
