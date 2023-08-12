package com.atguigu.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author lh
 * @date 2023/7/20 10:44
 * Description:
 */
public class MyBeanFactoryPostProcessor1 implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("beanDefinitionMap填充完毕回调该方法..");
        //注册某个beanDefinition
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClassName("com.atguigu.spring.dao.impl.PersonDaoImpl");

        //向下强转成 DefaultListableBeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory)beanFactory;
        //将 beanDefinition, put进beanDefinitionMap 进行注册
        defaultListableBeanFactory.registerBeanDefinition("personDao",beanDefinition);


    }
}
