package com.atguigu.spring.test;

import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.sercvice.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lh
 * @date 2023/3/6 9:20
 */
public class AutowireByXMLTest {
    //autowire="byType" 根据要赋值的属性的类型，在IOC容器中匹配某个bean，为属性赋值
    //注意：
    // 1.若通过类型没有找到任何一个类型匹配的bean，此时不装配，属性使用默认值
    // 2.若通过类型找到了多个类型匹配的bean，此时会抛出异常：NoUniqueBeanDefinitionException
    // 总结：当使用byType实现自动装配时，IOC容器中有且只有一个类型匹配的bean能够为属性赋值

    //autowire="byName"
    // 将要赋值的属性的属性名作为bean的id在IOC容器中匹配某个bean，为属性赋值
    //总结：当类型匹配的bean有多个时，此时可以使用byName实现自动装配
    @Test
    public void AutowireTest(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object date = ioc.getBean("date");
        System.out.println(date);
    }
}
