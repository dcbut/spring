package com.dcxuexi;

import com.dcxuexi.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

/***
 * @Title SpringDatesource
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/19 22:34
 * @Version 1.0.0
 */
public class SpringDatesource {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource dataSource = (DataSource) context.getBean("dataSource");
//        System.out.println(dataSource);
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.select();

        //System.out.println("=======================");
        //Map<String, String> env = System.getenv();
        //System.out.println(env);
    }
}