package com.atguigu.spring;

import com.atguigu.spring.proxy.Calculator;
import com.atguigu.spring.proxy.CalculatorStaticProxy;
import com.atguigu.spring.proxy.ProxyFactory;
import com.atguigu.spring.proxy.impl.CalculatorImpl;
import org.junit.Test;

/**
 * @author lh
 * @date 2023/3/6 15:21
 * 动态代理有2种：
 * 1.jdk动态代理，要求必须有接口，最终生成的代理类和目标类实现相同的接口
 * 在com.sun.proxy包下，类名为$proxy2
 * 2.cglib动态代理，最终生成的代理类会继承目标类，并且和目标类在相同的包下
 */
public class ProxyTest {
    @Test
    public void staticProxyTest(){
        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1,3);
    }

    @Test
    public void dynamicProxyTest(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        //实现共同接口进行向上转型
        Calculator proxy = (Calculator)proxyFactory.getProxy();
        proxy.add(1,2);
    }
}
