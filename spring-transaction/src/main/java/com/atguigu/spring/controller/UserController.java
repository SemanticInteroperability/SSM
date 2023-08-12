package com.atguigu.spring.controller;

import com.atguigu.spring.sercvice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author lh
 * @date 2023/3/6 9:01
 */
//可以通过标识组件的注解的value属性值设置bean的自定义id
//@Controller("controller")
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    public void saveUser(){
        userService.saveUser();
    }
}
