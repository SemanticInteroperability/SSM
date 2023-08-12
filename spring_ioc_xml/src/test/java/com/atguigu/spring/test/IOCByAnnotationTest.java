package com.atguigu.spring.test;

import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.sercvice.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;

/**
 * @author lh
 * @date 2023/3/6 10:02
 */
public class IOCByAnnotationTest {
    /**
     *
     * @Component：将类标识为普通组件
     * @Controller：将类标识为控制层组件
     * @Service：将类标识为业务层组件
     * @Repository：将类标识为持久层组件
     *  @Autowired:实现自动装配功能的注解  根据类型进行注入
     *  1. @Autowired注解能够标识的位置
     *       a.标识在成员变量上，此时不需要设置成员变量的set方法
     *       b.标识在set方法上
     *       c.标识在为当前成员变量赋值的有参构造上
     * @Resource :不指定名称参数时，根据类型注入（等同于@Autowired）；指定名称参数时，就根据名称注入（等同于@Autowired+@Qualifier）
     */
   @Test
    public void test()
   {
       ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
       UserController controller = ioc.getBean(UserController.class);
       System.out.println(controller);

       UserService service = ioc.getBean(UserService.class);
       System.out.println(service);

       UserDao dao = ioc.getBean(UserDao.class);
       System.out.println(dao);

       controller.saveUser();
   }
}
