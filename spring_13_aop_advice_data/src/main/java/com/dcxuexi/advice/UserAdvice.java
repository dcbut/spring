package com.dcxuexi.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/***
 * @Title UserAdvice
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 17:48
 * @Version 1.0.0
 */
@Component
@Aspect
public class UserAdvice {
    @Pointcut("execution(* com.dcxuexi.dao.UserDao.userInfoById(..))")
    public void ptUserDaoMethod(){}

    @AfterThrowing(value = "ptUserDaoMethod()",throwing = "t")
    public void afterThrowing(JoinPoint joinPoint,Throwable t){
        System.out.println("UserAdvice AfterThrowing , 开始  ......");
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("-----");
        System.out.println(t);
        System.out.println("UserAdvice AfterThrowing  , 结束......");
    }


    //@AfterReturning(value = "ptUserDaoMethod()" ,returning = "ret")
    public void afterReturning(JoinPoint point , Object ret){
        System.out.println("UserAdvice AfterReturning , 开始  ......");
        Object[] args = point.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("-----");
        System.out.println(ret);
        System.out.println("UserAdvice AfterReturning  , 结束......");
    }


    //@Around("ptUserDaoMethod()")
    public Object around(ProceedingJoinPoint point) {
        Object[] args = point.getArgs();
        System.out.println(Arrays.toString(args));
        args[1] = "lisi";
        Object ret = null;
        try{
            ret = point.proceed(args);
        }catch(Throwable t){
            t.printStackTrace();
        }
        return ret;
//        System.out.println("UserAdvice around , 开始 ......");
//        Object[] args = point.getArgs();
//        System.out.println(Arrays.toString(args));
//        args[1] = "lisi";
//        Object proceed = point.proceed(args);
//        System.out.println("UserAdvice around  , 结束......");
//        return proceed;
    }

//    @Before("ptUserDaoMethod()")
    public void before(JoinPoint joinPoint){
        System.out.println("UserAdvice before , 开始 ......");
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("UserAdvice before  , 结束......");
    }

//    @After("ptUserDaoMethod()")
    public void after(JoinPoint joinPoint){
        System.out.println("UserAdvice after , 开始  ......");
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("UserAdvice after  , 结束......");
    }







}
