package com.dcxuexi;

import com.dcxuexi.service.UserService;
import com.dcxuexi.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Title SpringBeanLifeUser
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/16 18:45
 * @Version 1.0.0
 */
public class SpringBeanLifeUser {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.select();
        //context.close();
        context.registerShutdownHook();
    }
}
