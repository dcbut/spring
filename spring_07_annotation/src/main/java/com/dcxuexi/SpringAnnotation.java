package com.dcxuexi;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Title SpringAnnotation
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/22 11:51
 * @Version 1.0.0
 */
public class SpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);
        //userDao.select();
        System.out.println(userDao);

        //按类型获取bean
        //UserService userService = context.getBean("userService", UserService.class);
        UserService userService = (UserService) context.getBean("userServiceImpl");
        //userService.select();
        System.out.println(userService);

    }
}
