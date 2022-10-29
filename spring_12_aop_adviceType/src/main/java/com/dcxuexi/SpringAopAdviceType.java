package com.dcxuexi;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Title SpringAopAdviceType
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/27 20:27
 * @Version 1.0.0
 */
public class SpringAopAdviceType {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        //userDao.select();

        int update = userDao.update();
        System.out.println(update);

    }
}
