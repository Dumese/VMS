package com.example.vms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.entity.ProductEntity;
import com.example.vms.data.vo.ProductVO;

public interface ProductService {
    Page<ProductEntity> select(Integer currentPage, Integer pageSize);
}
