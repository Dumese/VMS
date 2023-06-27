package com.example.vms.data.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("user")
public class UserEntity {
    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * 用户名
     */
    @TableField
    private String userName;
    /**
     * 用户密码
     */
    @TableField
    private String password;
    /**
     * 最近登陆时间
     */
    @TableField
    private Timestamp loginTime;
    /**
     * 手机号
     */
    @TableField
    private String phone;/**
     * 状态（0：离线、1：
     * 在线）
     */
    @TableField
    private Integer status;
    /**
     * 删除状态 0 否 1 是
     */
    @TableField
    private Integer del_flag;
}
