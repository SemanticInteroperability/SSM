package com.atguigu.spring.sercvice;

import mybatis.pojo.User;

import java.util.List;

/**
 * @author lh
 * @date 2023/3/6 9:03
 */
public interface UserService {
    /**
     * 保存用户信息
     */
    List<User> getUser();

}
