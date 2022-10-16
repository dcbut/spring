package com.dcxuexi;

import com.dcxuexi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Title SpringBean02
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/15 17:58
 * @Version 1.0.0
 */
public class SpringBean02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userServiceEbi");
        //userService.save();
        System.out.println(userService);
        UserService userService2 = (UserService) context.getBean("userServiceEbi");
        System.out.println(userService2);

    }
}
