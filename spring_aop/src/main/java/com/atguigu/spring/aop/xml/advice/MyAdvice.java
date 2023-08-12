package com.atguigu.spring.aop.xml.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author lh
 * @date 2023/7/25 11:28
 * Description: 增强类，内部提供增强方法
 */
@Component
@Aspect //将当前组件标识为切面
public class MyAdvice {


    public void beforeAdvice(){
        System.out.println("前置的增强。。");
    }

    @After("execution(void com.atguigu.spring.aop.xml.service.impl.UserServiceImpl.show1())")
    public void AfterAdvice(){
        System.out.println("后置的增强。。");
    }
}
