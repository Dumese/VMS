package com.example.vms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.entity.OrderEntity;
import com.example.vms.data.vo.OrderVO;
import com.example.vms.data.vo.ProductVO;
import com.example.vms.mapper.OrderMapper;
import com.example.vms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Page<OrderVO> select(Integer currentPage, Integer pageSize) {
        Page<OrderVO> page = new Page<>(currentPage, pageSize);

        //条件构造器
        QueryWrapper<OrderVO> wrapper = new QueryWrapper<>();
        wrapper.eq("del_flag", 0);

        orderMapper.selectPage(page, wrapper);
        return page;
    }
}
