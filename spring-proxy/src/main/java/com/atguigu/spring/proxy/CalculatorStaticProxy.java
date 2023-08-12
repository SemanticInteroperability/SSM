package com.atguigu.spring.proxy;

/**
 * @author lh
 * @date 2023/3/6 15:09
 */
public class CalculatorStaticProxy implements Calculator{
    private Calculator target;

    public CalculatorStaticProxy(Calculator target) {
        this.target = target;
    }

    public int add(int i, int j) {
        int result = 0;
        try {
            System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
            result = target.add(i, j);
            System.out.println("[日志] add 方法结束了，结果是：" + result);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return result;
    }

    public int sub(int i, int j) {
        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);
        int result = target.sub(i, j);
        System.out.println("[日志] sub 方法结束了，结果是：" + result);
        return result;
    }

    public int mul(int i, int j) {
        System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);
        int result = target.mul(i, j);
        System.out.println("[日志] mul 方法结束了，结果是：" + result);
        return result;

    }

    public int div(int i, int j) {
        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);
        int result = target.div(i, j);
        System.out.println("[日志] div 方法结束了，结果是：" + result);
        return result;
    }
}
