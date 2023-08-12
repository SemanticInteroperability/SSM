package com.atguigu.spring.processor;

import com.atguigu.spring.utils.BaseClassScanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

import java.util.Map;

/**
 * @author lh
 * @date 2023/7/20 11:37
 * Description:
 */
public class MyComponentBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        //通过扫描工具去扫描指定包及其子包下的所有类，收集使用@Mycomponent的注解的类
        Map<String, Class> myComponentAnnotation = BaseClassScanUtils.scanMyComponentAnnotation("com.atguigu.spring");
        //遍历Map，组装BeanDefinition进行注册
        myComponentAnnotation.forEach((beanName,clazz)->{
            String beanClassName = clazz.getName();//com.atguigu.spring.beans.OtherBean
            //创建BeanDefinition
            RootBeanDefinition beanDefinition = new RootBeanDefinition();
            beanDefinition.setBeanClassName(beanClassName);
            //注册
            registry.registerBeanDefinition(beanName,beanDefinition);
        });
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
