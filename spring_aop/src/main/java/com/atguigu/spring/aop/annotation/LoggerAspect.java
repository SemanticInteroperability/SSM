package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author lh
 * @date 2023/3/7 9:57
 * 在切面中，需要通过指定的注解将方法标识为通知方法
 * @Before：前置通知，在目标对象方法执行之前执行
 * @After: 后置通知，在目标对象方法的finally字句中执行
 * @AfterReturning:返回通知，在目标对象方法返回值之后执行
 */
@Component
@Aspect//将当前组件标识为切面
public class LoggerAspect {

    //切入点表达式的重用
    @Pointcut("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut(){}

//    @Before("execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.add(int,int))")

    @Before("pointCut()")
    //todo 在通知方法的参数位置，设置JoinPoint类型的参数，就可以获取连接点所对应方法的信息
    public void beforeAdviceMethod(JoinPoint joinPoint){
        //获取连接点所对应方法的签名信息
        Signature signature = joinPoint.getSignature();
        //获取连接点所对应方法的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect,前置通知 方法:"+signature.getName()+",参数为： "+ Arrays.toString(args));
    }

   @After("pointCut()")
    public void afterAdviceMethod(JoinPoint joinPoint){
       System.out.println("LoggerAspect,最终通知 执行完毕");
   }

   @AfterReturning(value = "pointCut()",returning = "result")
   /**
    * 在返回通知中若要获取目标对象方法的返回值
    * 只需要通过@AfterReturning注解的returning属性
    * 就可以将通知方法的某个参数指定为接收目标对象方法的返回值的参数
    */
   public void afterReturningAdviceMethod(JoinPoint joinPoint,Object result){
       Signature signature = joinPoint.getSignature();
       System.out.println("LoggerAspect,后置返回通知 方法:"+signature.getName()+",结果为:"+result );
   }


   @AfterThrowing(value = "pointCut()",throwing = "ex")
   /**
    * 在返回通知中若要获取目标对象方法的返回值
    * 只需要通过@AfterReturning注解的Throwable属性
    * 就可以将通知方法的某个参数指定为接收目标对象方法的异常的参数
    */
    public void afterThrowAdviceMethod(JoinPoint joinPoint,Throwable ex){
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,异常通知 方法:"+signature.getName()+"异常信息:"+ex);
    }


    @Around("pointCut()")
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            System.out.println("环绕通知->前置通知");

            //表示目标对象方法的执行
            Signature signature = joinPoint.getSignature();
            System.out.println("方法名："+signature.getName());
            Object[] args = joinPoint.getArgs();
            System.out.println("方法参数："+ Arrays.toString(args));
            result = joinPoint.proceed();
            System.out.println("环绕通知->返回通知");

        }  catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知->异常通知");
        } finally {
            System.out.println("环绕通知->后置通知");
        }
        return result;
    }
}

