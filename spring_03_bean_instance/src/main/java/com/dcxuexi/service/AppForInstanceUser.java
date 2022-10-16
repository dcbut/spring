package com.dcxuexi.service;

import com.dcxuexi.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Title AppForInstanceUser
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/16 17:29
 * @Version 1.0.0
 */
public class AppForInstanceUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        UserDao userDao2 = (UserDao) context.getBean("userDao");
        userDao.save();
        userDao2.save();
        System.out.println(userDao);
        System.out.println(userDao2);

    }
}
