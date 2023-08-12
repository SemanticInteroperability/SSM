package com.atguigu.spring.config;

import com.atguigu.spring.dao.impl.UserDaoImpl;
import com.atguigu.spring.imports.MyImportBeanDefinitionRegistrar;
import com.atguigu.spring.imports.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author lh
 * @date 2023/7/24 19:33
 * Description:
 *
 */
@Configuration //标注当前类是一个配置类（代替配置文件）+ @Component 交给spring容器管理
@ComponentScan("com.atguigu.spring") //<context:component-scan base-package="com.atguigu.spring"></context:component-scan>
@PropertySource("classpath:jdbc.properties") // <context:property-placeholder location="classpath:jdbc.properties"></context:property-placeholder>
//@Import(UserDaoImpl.class)//用于加载其他配置类,替代原有的 <import resource="classpath:refCycle.xml"/>
@Import({MyImportSelector.class,UserDaoImpl.class})
//@Import({MyImportBeanDefinitionRegistrar.class,UserDaoImpl.class})
public class SpringConfig {

}
