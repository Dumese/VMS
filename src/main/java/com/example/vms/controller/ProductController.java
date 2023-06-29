package com.example.vms.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.vo.ProductVO;
import com.example.vms.service.ProductService;
import com.example.vms.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     *分页查询商品列表
     * @param currentPage   当前页
     * @param pageSize  页大小
     * @return 商品列表
     */
    @GetMapping("/select")
    public Page<ProductVO> select(@RequestParam(defaultValue = "1", value = "currentPage") Integer currentPage,
                                  @RequestParam(defaultValue = "8", value = "pageSize") Integer pageSize){
        return productService.select(currentPage, pageSize);
    }

    /**
     * 添加商品
     * @param product   商品
     * @return  添加结果
     */
    @PostMapping("/add")
    public Result<ProductVO> add(@RequestBody ProductVO product){
        return productService.add(product);
    }
}
