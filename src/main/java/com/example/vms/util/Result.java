package com.example.vms.util;

import lombok.Getter;

@Getter
public class Result<T>{
    //状态码
    private Integer status;
    //错误的状态信息
    private String message;
    //数据
    private T data;

    public Result(Integer status) {
        this.status = status;
    }

    public Result(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
