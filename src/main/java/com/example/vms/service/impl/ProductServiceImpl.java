package com.example.vms.service.impl;

import com.example.vms.util.Result;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.vo.ProductVO;
import com.example.vms.mapper.ProductMapper;
import com.example.vms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Page<ProductVO> select(Integer currentPage, Integer pageSize) {
        Page<ProductVO> page = new Page<>(currentPage, pageSize);

        //条件构造器
        QueryWrapper<ProductVO> wrapper = new QueryWrapper<>();
        wrapper.eq("del_flag", 0);

        productMapper.selectPage(page, wrapper);
        return page;
    }

    @Override
    public Result<ProductVO> add(ProductVO product) {
        int num =  productMapper.insert(product);
        String msg = "成功插入了"+num+"条数据";
        return new Result<ProductVO>(100, msg, product);
    }
}
