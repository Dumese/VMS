package com.example.vms.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.example.vms.data.dto.UserLoginDTO;
import com.example.vms.data.entity.UserEntity;
import com.example.vms.mapper.UserMapper;
import com.example.vms.service.UserService;
import com.mysql.cj.Session;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.session.StandardSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Object login(UserLoginDTO user) {
        Long id = user.getId();

        UserEntity userEntity = userMapper.selectById(id);

        if(!(null == userEntity || ObjectUtil.isEmpty(user))){
            String password = user.getPassword();
            if(userEntity.getPassword().equals(password)){
                HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
                HttpSession session = request.getSession();
                session.setAttribute("id", userEntity.getId());
                return session;
            }
            return new RuntimeException("ID或密码错误。请重新登录！");
        }
        return new RuntimeException("未查询到该用户，请检查ID！");
    }
}
