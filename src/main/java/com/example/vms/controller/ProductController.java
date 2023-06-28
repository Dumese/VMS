package com.example.vms.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.entity.ProductEntity;
import com.example.vms.data.vo.ProductVO;
import com.example.vms.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/select")
    public Page<ProductEntity> select(@RequestParam(defaultValue = "1", value = "currentPage") Integer currentPage,
                                      @RequestParam(defaultValue = "10", value = "pageSize") Integer pageSize){
        return productService.select(currentPage, pageSize);
    }
}
