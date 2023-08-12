package com.atguigu.spring.test;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.sercvice.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lh
 * @date 2023/7/19 22:37
 * Description:
 */
public class ApplicationContextTest {
    @Test
    public void applicationContextTest() throws Exception {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserDao userDao = ioc.getBean(UserDao.class);

        userDao.saveUser();


    }
}
