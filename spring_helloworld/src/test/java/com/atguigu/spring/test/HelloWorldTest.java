package com.atguigu.spring.test;


import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Person;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

//        HelloWorld helloworld = ioc.getBean("helloworld",HelloWorld.class);
        Person person = ioc.getBean(Person.class);
        System.out.println(person);

    }

    @Test
    public void DItest(){
        //set注入
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = ioc.getBean("stu4",Student.class);

        System.out.println(student);

//        Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
//        System.out.println(clazz);

    }
}
