package com.example.vms.data.vo;

import lombok.Data;

@Data
public class UserRegisterVO {
    /**
     * id
     */
    private Long id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
}
