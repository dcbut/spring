package com.dcxuexi.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/***
 * @Title MyAdvice
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/27 20:35
 * @Version 1.0.0
 */
@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.dcxuexi.dao.UserDao.select())")
    public void ptSelect(){}

    @Pointcut("execution(int com.dcxuexi.dao.UserDao.update())")
    public void ptUpdate(){}

    @Around("ptUpdate()")
    public Object around(ProceedingJoinPoint proceedingJoinPointp)  {
         // 代码1   ## 增强代码写在代码1位置就是前置通知 ，效果如 @Before("ptUpdate()")
         Object proceed = null;
         try {
             // 代码2   ## 增强代码写在代码2位置就是前置通知 ，效果如 @Before("ptUpdate()")

             //表示对原始操作的调用
             proceed = proceedingJoinPointp.proceed();

             // 代码3   ## 增强代码写在代码3位置就是返回后通知 ，效果如@AfterReturning("ptUpdate()")

         } catch (Throwable throwable) {
             // 代码4   ## 增强代码写在代码4位置就是异常后通知 ，效果如 @AfterThrowing("ptUpdate()")
         }
         // 代码5   ## 增强代码写在代码5位置就是后置通知 ，效果如 @After("ptUpdate()")
         return proceed;
    }



    @AfterThrowing("ptUpdate()")
    public void afterThowing(){
        System.out.println("MyAdvice afterThowing() , running .....");
    }


//    @AfterReturning("ptUpdate()")
//    public void afterReturning(){
//        System.out.println("MyAdvice afterReturning() , running .....");
//    }



//    @Around("ptUpdate()")
//    public Object around(ProceedingJoinPoint proceedingJoinPointp) throws Throwable {
//        System.out.println("MyAdvice around() , running .....");
//        System.out.println("Before ....");
//        //表示对原始操作的调用
//        Object proceed = proceedingJoinPointp.proceed();
//        System.out.println("End ......");
//        return proceed;
//    }

    //此处也可以写成 @Before("MyAdvice.ptSelect()"),不建议
//    @Before("ptSelect()")
//    public void before(){
//        System.out.println("MyAdvice before() , running .....");
//    }
//
//    @After("ptSelect()")
//    public void after(){
//        System.out.println("MyAdvice after() , running .....");
//    }






}
