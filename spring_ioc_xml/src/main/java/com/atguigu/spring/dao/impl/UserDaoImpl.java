package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @author lh
 * @date 2023/3/6 9:06
 */
//@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Value("${jdbc.username}")
    private String userName;

    public void saveUser() {
        System.out.println(userName);
        System.out.println("保存成功");
    }
}
