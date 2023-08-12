package com.atguigu.mybatis.test;

import com.atguigu.mybatis.pojo.User;
import com.atguigu.spring.sercvice.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author lh
 * @date 2023/7/19 22:37
 * Description:
 */
public class ApplicationContextTest {
    @Test
    public void applicationContextTest() throws Exception {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ioc.getBean("userService");
        List<User> user = userService.getUser();
        System.out.println(user);




    }
}
