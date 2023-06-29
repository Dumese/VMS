package com.example.vms.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.vo.ProductVO;
import com.example.vms.util.Result;

public interface ProductService {
    Page<ProductVO> select(Integer currentPage, Integer pageSize);

    Result<ProductVO> add(ProductVO product);
}
