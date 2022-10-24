package com.dcxuexi.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/***
 * @Title MyAdvice
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/24 20:42
 * @Version 1.0.0
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.dcxuexi.dao.impl.UserDaoImpl.update())")
    public void pt(){}

    @Before("pt()")
    public void methodBefore(){
        System.out.println(System.currentTimeMillis());
    }
}
