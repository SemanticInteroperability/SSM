package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Student;
import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    1.实例化
    2.依赖注入
    3.初始化：需要通过bean的init-method属性指定初始化的方法
    4.销毁：需要通过bean的destroy-method属性指定销毁的方法
    注意：
        若bean的作用域为单例时，生命周期的前3个步骤会在获取IOC容器时执行
        若bean的作用域为多例时，生命周期的前3个步骤会在获取bean时执行

*/
public class LifeCycleTest {
    @Test
    public void lifeCycleTest(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }
}
