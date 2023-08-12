package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author lh
 * @date 2023/3/7 14:40
 * @Order(1)  切面的优先级 通过@Order注解的value属性值设置优先级，默认值是Integer的最大值
 * 属性值越小，优先级越高
 */

@Component
@Aspect
@Order(1)//切面的优先级 通过@Order注解的value属性值设置优先级，默认值是Integer的最大值
public class ValidateAspect {


    @Before("com.atguigu.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect,前置通知");
    }
}
