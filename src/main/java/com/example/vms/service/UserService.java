package com.example.vms.service;

import com.example.vms.data.dto.UserLoginDTO;

public interface UserService {
    Object login(UserLoginDTO user);
}
