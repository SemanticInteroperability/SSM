package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();

    int updateUser();

    int deleteUser();

    /**
     * 根据id查询用户信息
     * @return
     */
    User getUserById();

    List<User> getUserList();
}
