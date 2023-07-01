package com.example.vms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.vo.OrderVO;

public interface OrderService {
    Page<OrderVO> select(Integer currentPage, Integer pageSize);
}
