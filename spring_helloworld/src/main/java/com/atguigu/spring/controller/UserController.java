package com.atguigu.spring.controller;

import com.atguigu.spring.sercvice.UserService;
import mybatis.pojo.User;

import java.util.List;

/**
 * @author lh
 * @date 2023/3/6 9:01
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public List<User> getUser(){
        return userService.getUser();
    }
}
