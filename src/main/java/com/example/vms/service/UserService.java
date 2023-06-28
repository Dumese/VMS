package com.example.vms.service;

import com.example.vms.data.dto.UserLoginDTO;
import com.example.vms.data.vo.UserRegisterVO;

public interface UserService {
    Object login(UserLoginDTO user);

    Object register(UserRegisterVO user);
}
