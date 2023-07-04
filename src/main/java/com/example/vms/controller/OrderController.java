package com.example.vms.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.vo.OrderDetailVO;
import com.example.vms.data.vo.OrderVO;
import com.example.vms.service.OrderService;
import com.example.vms.util.OrderResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 查看订单详情
     * @param currentPage   当前页
     * @param pageSize  页大小
     * @param id    订单id
     * @return  订单详情列表
     */
    @GetMapping("/selectDetail")
    public Page<OrderDetailVO> selectDetail(@RequestParam(defaultValue = "1", value = "currentPage") Integer currentPage,
                                            @RequestParam(defaultValue = "8", value = "pageSize") Integer pageSize,
                                            Long id){
        return orderService.selectDetail(currentPage, pageSize, id);
    }

    /**
     * 添加订单
     * @param orderResult 订单结果集
     */
    @PostMapping("/add")
    public void add(@RequestBody OrderResult orderResult){
        orderService.add(orderResult);
    }
}
