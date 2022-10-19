package com.dcxuexi;

import com.dcxuexi.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Title SpringCollection
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/18 22:48
 * @Version 1.0.0
 */
public class SpringCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.select();
    }
}
