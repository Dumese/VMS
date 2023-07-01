package com.example.vms.data.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@TableName("order")
public class OrderEntity {
    /**
     * 订单id
     */
    @TableId
    private Long id;
    /**
     * 总金额
     */
    @TableField
    private BigDecimal sum;
    /**
     * 状态（0：未完成、1：
     * 已完成）
     */
    @TableField
    private Integer status;
    /**
     * 生成订单时间
     */
    @TableField
    private Timestamp createdTime;
    /**
     * 完成订单时间
     */
    @TableField
    private Timestamp finishTime;
    /**
     * 创建人
     */
    @TableField
    private String createdBy;
    /**
     * 删除状态 0 否 1 是
     */
    @TableField
    private Integer del_flag;
}
