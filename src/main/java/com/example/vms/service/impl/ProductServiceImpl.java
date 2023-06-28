package com.example.vms.service.impl;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.entity.ProductEntity;
import com.example.vms.data.vo.ProductVO;
import com.example.vms.mapper.ProductMapper;
import com.example.vms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Page<ProductEntity> select(Integer currentPage, Integer pageSize) {
        Page<ProductEntity> page = new Page<>(currentPage, pageSize);
        productMapper.selectPage(page, null);
        return page;
    }
}
