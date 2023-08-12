package com.atguigu.spring.factory;

import com.atguigu.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author lh
 * @date 2023/3/5 21:57
 * 当把FactoryBean的实现类配置为bean时，会将当前类中类中getObject()所返回的对象交给IOC容器管理
 */
public class UserFactoryBean implements FactoryBean<User> {
    public User getObject() throws Exception {
        System.out.println("调用getObject方法。。");
        return new User();
    }

    public Class<?> getObjectType() {
        return User.class;
    }
}
