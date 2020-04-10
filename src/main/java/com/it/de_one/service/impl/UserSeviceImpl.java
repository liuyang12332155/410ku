package com.it.de_one.service.impl;

import com.it.de_one.bean.User;
import com.it.de_one.mapper.UserMapper;
import com.it.de_one.mapper.UserMapper2;
import com.it.de_one.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class UserSeviceImpl implements UserService {
    @Autowired
    private UserMapper2 userMapper;
    @Override
    @Cacheable("getUsers")
    public List<User> selectUsers(){
        System.out.println("被访问了");
        return userMapper.selectAll();
    }

}
