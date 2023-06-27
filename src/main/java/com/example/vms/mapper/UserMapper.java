package com.example.vms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.vms.data.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
