package com.example.vms.data.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

import static com.baomidou.mybatisplus.annotation.IdType.INPUT;

@Data
@TableName("product")
public class ProductEntity {
    /**
     * id
     */
    @TableId()
    private Long id;
    /**
     * 商品名称
     */
    @TableField
    private String productName;
    /**
     * 商品信息
     */
    @TableField
    private String detail;
    /**
     *供应商
     */
    @TableField
    private String provider;
    /**
     *产地
     */
    @TableField
    private String place;
    /**
     *储存量
     */
    @TableField
    private Integer stock;
    /**
     *原价
     */
    @TableField
    private BigDecimal originalPrice;
    /**
     *售价
     */
    @TableField
    private BigDecimal price;
    /**
     * 删除状态 0 否 1 是
     */
    @TableField
    private Integer del_flag;
}
