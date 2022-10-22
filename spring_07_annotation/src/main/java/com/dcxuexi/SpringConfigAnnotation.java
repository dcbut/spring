package com.dcxuexi;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.dao.UserDao;
import com.dcxuexi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Title SpringConfigAnnotation
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/22 16:07
 * @Version 1.0.0
 */
public class SpringConfigAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);
    }
}
