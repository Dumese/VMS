package com.example.vms.data.dto;

import lombok.Data;

@Data
public class ProductDTO {
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
