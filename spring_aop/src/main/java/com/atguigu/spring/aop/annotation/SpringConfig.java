package com.atguigu.spring.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lh
 * @date 2023/7/27 10:29
 * Description:
 */
@Configuration
@ComponentScan("com.atguigu.spring.aop.xml.*") //<context:component-scan base-package="com.atguigu.spring.aop.annotation"></context:component-scan>
@EnableAspectJAutoProxy //<aop:aspectj-autoproxy/>
public class SpringConfig {
}
