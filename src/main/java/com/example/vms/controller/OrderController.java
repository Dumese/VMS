package com.example.vms.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.vo.OrderDetailVO;
import com.example.vms.data.vo.OrderVO;
import com.example.vms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 查看订单
     * @param currentPage   当前页
     * @param pageSize  页大小
     * @return  订单列表
     */
    @GetMapping("/select")
    public Page<OrderVO> select(@RequestParam(defaultValue = "1", value = "currentPage") Integer currentPage,
                                @RequestParam(defaultValue = "8", value = "pageSize") Integer pageSize){
        return orderService.select(currentPage, pageSize);
    }

    @GetMapping("selectDetail")
    public Page<OrderDetailVO> selectDetail(){
        return null;
    }
}
