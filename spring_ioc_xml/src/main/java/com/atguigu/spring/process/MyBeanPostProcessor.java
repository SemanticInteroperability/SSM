package com.atguigu.spring.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author lh
 * @date 2023/3/5 21:45
 *
 * 1.实例化
 * 2.依赖注入
 * 3.MyBeanPostProcessor->后置处理器postProcessBeforeInitialization
 * 4.初始化..
 * 5.MyBeanPostProcessor->后置处理器postProcessAfterInitialization
 * 6.销毁..
 * bean的后置处理器会在生命周期的初始化前后添加额外的操作，需要实现BeanPostProcessor接口，
 * 且配置到IOC容器中，需要注意的是，bean后置处理器不是单独针对某一个bean生效，而是针对IOC容器中所有bean都会执行
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor->后置处理器postProcessBeforeInitialization");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor->后置处理器postProcessAfterInitialization");
        return bean;
    }
}
