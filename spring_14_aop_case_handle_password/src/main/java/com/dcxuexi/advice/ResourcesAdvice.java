package com.dcxuexi.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/***
 * @Title ResourcesAdvice
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 22:01
 * @Version 1.0.0
 */
@Component
@Aspect
public class ResourcesAdvice {

    @Pointcut("execution(* com.dcxuexi.service.*Service.*(*,*))")
    public void ptService(){}

    //@Around("ptService()") 这两种写法都对
    @Around("ResourcesAdvice.ptService()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //获取原始方法的参数
        Object[] args = proceedingJoinPoint.getArgs();
        for (int i = 0; i < args.length; i++) {
            //判断参数是不是字符串
            if (args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim(); // 去重空格
            }
        }
        // 将修改后的值传到原始方法的执行中
        Object proceed = proceedingJoinPoint.proceed(args);
        return proceed;
    }



}
