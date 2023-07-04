package com.example.vms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vms.data.vo.OrderDetailVO;
import com.example.vms.data.vo.OrderVO;
import com.example.vms.mapper.OrderDetailMapper;
import com.example.vms.mapper.OrderMapper;
import com.example.vms.service.OrderService;
import com.example.vms.util.OrderResult;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public Page<OrderVO> select(Integer currentPage, Integer pageSize) {
        Page<OrderVO> page = new Page<>(currentPage, pageSize);

        //条件构造器
        QueryWrapper<OrderVO> wrapper = new QueryWrapper<>();
        wrapper.eq("del_flag", 0);

        orderMapper.selectPage(page, wrapper);
        return page;
    }

    @Override
    public Page<OrderDetailVO> selectDetail(Integer currentPage, Integer pageSize, Long id) {
        Page<OrderDetailVO> page = new Page<>(currentPage, pageSize);

        //条件构造器
        QueryWrapper<OrderDetailVO> wrapper = new QueryWrapper<>();
        wrapper.eq("order_id", id);

        orderDetailMapper.selectPage(page, wrapper);
        return page;
    }

    @Override
    public void add(OrderResult orderResult) {
        OrderVO order = orderResult.getOrder();
        orderMapper.insert(order);

        Long id = orderMapper.selectInsertId();

        List<OrderDetailVO> orderDetailDTOList = orderResult.getOrderDetailVOList();
        orderDetailDTOList.forEach(OrderDetailVO -> OrderDetailVO.setOrderId(id));

        //使用批处理
        long start = System.currentTimeMillis();
        SqlSession sqlSession = sqlSessionFactory.openSession(ExecutorType.BATCH,false);
        OrderDetailMapper orderDetailMapper1 = sqlSession.getMapper(OrderDetailMapper.class);
        orderDetailDTOList.stream().forEach(orderDetailDTO -> orderDetailMapper1.insert(orderDetailDTO));
        sqlSession.commit();
        sqlSession.clearCache();


    }
}
