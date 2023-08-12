package com.atguigu.spring;

import com.atguigu.spring.aop.xml.service.UserService;
import com.atguigu.spring.aop.xml.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lh
 * @date 2023/3/7 10:25
 */
public class AopApplicationContextTest {
    @Test
    public void aopApplicationContextTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        //报错 java.lang.ClassCastException: com.sun.proxy.$Proxy4 cannot be cast to
        //代理的结果对象和这个接口的实现类是同级的。也就是说代理对象和小编定义的接口实现类分别实现了该接口，
        // 二者之间根据java语言的转换原则是不能转换的，因此抛出转换异常。
        //当把转换类型换成接口类型时，就可解决这个异常了。
        UserService userService = applicationContext.getBean(UserService.class);
        userService.show1();
    }
}
