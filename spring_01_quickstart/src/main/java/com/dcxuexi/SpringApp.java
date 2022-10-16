package com.dcxuexi;


import com.dcxuexi.dao.UserDao;
import com.dcxuexi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Title SpringApp
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/15 10:27
 * @Version 1.0.0
 */
public class SpringApp {
    public static void main(String[] args) {
        //获取IOC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserDao userDao = (UserDao) context.getBean("UserDao");
        //userDao.save();
        UserService userService = (UserService) context.getBean("UserService");
        userService.save();
    }
}
