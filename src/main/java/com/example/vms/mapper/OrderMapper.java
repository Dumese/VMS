package com.example.vms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vms.data.entity.OrderEntity;
import com.example.vms.data.vo.OrderVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<OrderVO> {

}
