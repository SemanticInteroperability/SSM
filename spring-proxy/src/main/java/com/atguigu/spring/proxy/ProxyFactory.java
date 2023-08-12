package com.atguigu.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author lh
 * @date 2023/3/6 15:37
 * JDK动态代理只提供接口的代理
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        /** todo
         *   ClassLoader loader：指定加载动态生成的代理类的类加载器
         *   Class<?>[] interfaces：获取目标对象实现的所有接口的class对象的数组 因为代理类和目标类都是实现的同样的接口
         *   InvocationHandler h 设置代理类中的抽象方法如何重写
         */
        ClassLoader classLoader = this.getClass().getClassLoader();

        Class<?>[] interfaces = target.getClass().getInterfaces();

        InvocationHandler h = new InvocationHandler() {

            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object o = null;
                try {
                    System.out.println("[日志]  方法名： "+method.getName()+",参数是：" + Arrays.toString(args));
                    o = method.invoke(target, args);
                    System.out.println("[日志]  方法名： "+method.getName()+",结果是：" + o);

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("[日志]  方法名： "+method.getName()+",异常是：" + e);
                } finally {
                    System.out.println("方法执行完毕！关闭资源");
                }
                return o;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,h);
    }
}
