package com.atguigu.spring.test;

import com.atguigu.spring.beans.OtherBean;
import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.dao.impl.PersonDaoImpl;
import com.atguigu.spring.dao.impl.UserDaoImpl;
import com.atguigu.spring.sercvice.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

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
        userService.getUser();
        //System.out.println(userDao);




    }
}
