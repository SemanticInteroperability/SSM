package com.atguigu.spring.sercvice.impl;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.sercvice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lh
 * @date 2023/3/6 9:05
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    public void saveUser() {
        userDao.saveUser();
    }
}
