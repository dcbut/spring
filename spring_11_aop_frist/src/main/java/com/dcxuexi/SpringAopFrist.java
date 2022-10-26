package com.dcxuexi;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.dao.CityDao;
import com.dcxuexi.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Title SpringAopFrist
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/24 20:30
 * @Version 1.0.0
 */
public class SpringAopFrist {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        //userDao.select();
        //auserDao.update();
        //userDao.insert();
        System.out.println(userDao);
        System.out.println(userDao.getClass());
        System.out.println("==============================");
        //CityDao cityDao = context.getBean(CityDao.class);
        //System.out.println(cityDao);
        //System.out.println(cityDao.getClass());

    }
}
