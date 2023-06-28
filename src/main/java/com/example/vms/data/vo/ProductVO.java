package com.example.vms.data.vo;

import lombok.Data;

import java.security.PrivilegedAction;

@Data
public class ProductVO {
    /**
     * id
     */
    private Long id;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品信息
     */
    private String detail;
    /**
     *供应商
     */
    private String provider;
    /**
     *产地
     */
    private String place;
    /**
     *储存量
     */
    private String stock;
    /**
     *原价
     */
    private String originalPrice;
    /**
     *售价
     */
    private String price;
}
