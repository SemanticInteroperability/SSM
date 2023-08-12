package com.atguigu.spring.factory;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.dao.impl.UserDaoImpl;

/**
 * @author lh
 * @date 2023/7/19 20:45
 * Description:
 */
public class MyBeanFactory {
    public static UserDao userDao(){
        return new UserDaoImpl();
    }
}
