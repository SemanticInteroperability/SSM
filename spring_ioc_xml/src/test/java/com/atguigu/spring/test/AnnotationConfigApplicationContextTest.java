package com.atguigu.spring.test;

import com.atguigu.spring.beans.OtherBean2;
import com.atguigu.spring.config.SpringConfig;
import com.atguigu.spring.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lh
 * @date 2023/7/24 19:45
 * Description:
 */
public class AnnotationConfigApplicationContextTest {

    @Test
    public void annotationConfigApplicationContextTest() throws Exception {
        ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        OtherBean2 bean = ioc.getBean(OtherBean2.class);

        System.out.println(bean);


    }
}
