package com.atguigu.spring.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @author lh
 * @date 2023/3/6 14:43
 *
 * 面向对象，纵向继承，只能将连续的代码进行封装
 */

@Component
public class CalculatorImpl implements Calculator {
    public int add(int i, int j) {

        int result = i + j;
        System.out.println("方法内部 result = " + result);

        return result;
    }

    public int sub(int i, int j) {

        int result = i - j;
        System.out.println("方法内部 result = " + result);

        return result;
    }

    public int mul(int i, int j) {

        int result = i * j;

        System.out.println("方法内部 result = " + result);

        return result;
    }

    public int div(int i, int j) {

        int result = i / j;
        System.out.println("方法内部 result = " + result);

        return result;
    }
}
