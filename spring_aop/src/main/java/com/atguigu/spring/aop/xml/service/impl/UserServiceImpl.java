package com.atguigu.spring.aop.xml.service.impl;

import com.atguigu.spring.aop.xml.service.UserService;
import org.springframework.stereotype.Component;


/**
 * @author lh
 * @date 2023/7/25 11:27
 * Description:
 */
@Component
public class UserServiceImpl implements UserService {
    public void show1(){
        System.out.println("show1...");
    }

    public void show2(){
        System.out.println("show2...");
    }
}
