package com.dcxuexi;

import com.dcxuexi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Title SpringSetter
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/17 22:07
 * @Version 1.0.0
 */
public class SpringSetter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.selectInfo();
    }
}
