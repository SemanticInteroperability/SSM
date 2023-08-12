package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.sercvice.UserService;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author lh
 * @date 2023/3/6 9:06
 */
public class UserDaoImpl implements UserDao, InitializingBean {

    private UserService userService;

    public void saveUser() {
        System.out.println("保存成功");
    }


    public UserDaoImpl(){
        System.out.println("UserDaoImpl无参构造实例化");
    }
    public void init(){
        System.out.println("init初始化方法执行");
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("属性设置之后执行");
    }
}
