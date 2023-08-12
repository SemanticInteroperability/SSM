package com.atguigu.spring;

import com.atguigu.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lh
 * @date 2023/3/7 10:25
 */
public class aopAnnotationTest {
    @Test
    public void aopByAnnotationTest(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        //获取代理对象
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(1,1);
    }
}
