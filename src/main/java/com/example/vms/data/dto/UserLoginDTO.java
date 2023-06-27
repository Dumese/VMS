package com.example.vms.data.dto;

import lombok.Data;

@Data
public class UserLoginDTO {
    /**
     * id
     */
    private Long id;
    /**
     * 密码
     */
    private String password;
}
