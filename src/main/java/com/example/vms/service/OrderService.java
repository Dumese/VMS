package com.example.vms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.vo.OrderDetailVO;
import com.example.vms.data.vo.OrderVO;
import com.example.vms.util.OrderResult;

public interface OrderService {
    Page<OrderVO> select(Integer currentPage, Integer pageSize);

    Page<OrderDetailVO> selectDetail(Integer currentPage, Integer pageSize, Long id);

    void add(OrderResult orderResult);
}
