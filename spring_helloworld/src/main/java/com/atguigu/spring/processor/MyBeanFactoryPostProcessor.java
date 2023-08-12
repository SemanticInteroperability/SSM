package com.atguigu.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author lh
 * @date 2023/7/20 10:44
 * Description:
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("beanDefinitionMap填充完毕回调该方法");
        //修改某个beanDefinition
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userDao3");
        beanDefinition.setBeanClassName("com.atguigu.spring.pojo.HelloWorld");


    }
}
