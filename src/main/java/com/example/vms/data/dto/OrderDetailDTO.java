package com.example.vms.data.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDetailDTO {
    /**
     * 订单明细id
     */
    @TableId
    private Long id;
    /**
     *所属订单id
     */
    @TableField
    private Long orderId;
    /**
     * 商品id
     */
    @TableField
    private Long productId;
    /**
     * 商品数目
     */
    @TableField
    private Integer num;
    /**
     * 单价
     */
    @TableField
    private BigDecimal price;
}
