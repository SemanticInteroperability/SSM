package com.atguigu.spring.test;

import com.atguigu.spring.sercvice.UserService;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author lh
 * @date 2023/7/19 16:20
 * Description:
 */
public class BeanFactoryTest {
    @Test
    public void beanFactoryTest(){
        //创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //创建一个读写器（xml文件）
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

        //读取配置文件给工厂
        reader.loadBeanDefinitions("spring-autowire.xml");

        //根据id获取Bean实例对象
        UserService userService = (UserService)beanFactory.getBean("userService");

        System.out.println(userService);
    }
}
