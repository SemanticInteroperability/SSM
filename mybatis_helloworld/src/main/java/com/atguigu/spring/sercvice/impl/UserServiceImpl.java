package com.atguigu.spring.sercvice.impl;


import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.spring.sercvice.UserService;

import java.util.List;

/**
 * @author lh
 * @date 2023/3/6 9:05
 */
public class UserServiceImpl implements UserService {


    private String name;

    private UserMapper userMapper;

    public void setName(String name) {
        this.name = name;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }



    public UserServiceImpl() {
        System.out.println("UserServiceImpl无参构造实例化");
    }

    public List<User> getUser() {
        return userMapper.getUserList();
    }
}
