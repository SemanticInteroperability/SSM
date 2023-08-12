package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author lh
 * @date 2023/3/6 9:06
 */
@Repository
public class UserDaoImpl implements UserDao {

    public void saveUser() {
        System.out.println("保存成功");
    }
}
