package com.example.vms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vms.data.entity.ProductEntity;
import com.example.vms.data.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseMapper<ProductEntity> {

}
