package com.dcxuexi.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/***
 * @Title UserAdvice
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 17:00
 * @Version 1.0.0
 */
@Component
@Aspect
public class UserAdvice {
    //配置业务层的所有方法
    @Pointcut("execution(* com.dcxuexi.service.*Service.*(..))")
    public void ptservice(){}

    @Around("ptservice()")
    public Object speed(ProceedingJoinPoint proceedingJoinPoint){
        Object proceed = null;
        try {
            Signature signature = proceedingJoinPoint.getSignature(); //获取执行签名信息
            String className = signature.getDeclaringTypeName(); //通过签名获取执行操作名称(接口名)
            String metohName = signature.getName(); //通过签名获取执行操作名称(方法名)
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                proceed = proceedingJoinPoint.proceed();
            }
            long end = System.currentTimeMillis();
            System.out.println("执行一万次 : "+ className + "." + metohName + " ===>" + (end-start) +"ms");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;
    }
}
