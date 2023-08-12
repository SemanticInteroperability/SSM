package com.atguigu.spring.sercvice.impl;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.sercvice.UserService;
import mybatis.mapper.UserMapper;
import mybatis.pojo.User;

import java.util.List;

/**
 * @author lh
 * @date 2023/3/6 9:05
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    private String name;

    private UserMapper userMapper;

    public void setName(String name) {
        this.name = name;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("UserServiceImpl执行注入userDao的操作：setUserDao方法执行");
        this.userDao = userDao;
    }

    public UserServiceImpl() {
        System.out.println("UserServiceImpl无参构造实例化");
    }

    public List<User> getUser() {
        return userMapper.getUserList();
    }
}
