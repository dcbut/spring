package com.dcxuexi;

import com.dcxuexi.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/***
 * @Title SpringContainer
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/21 21:36
 * @Version 1.0.0
 */
public class SpringContainer {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\java\\idea-workspace\\github\\springProjeck\\spring_06_container\\src\\main\\resources\\applicationContext.xml");
        //UserDao userDao = (UserDao) context.getBean("userDao");
        //UserDao userDao = context.getBean("userDao",UserDao.class);
        UserDao userDao = context.getBean(UserDao.class);
        userDao.select();
    }
}
