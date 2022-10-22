package com.dcxuexi;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Title SpringAnnotationBean
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/22 16:27
 * @Version 1.0.0
 */
public class SpringAnnotationBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        UserDao userDao2 = context.getBean(UserDao.class);
        System.out.println(userDao);
        System.out.println(userDao2);
        context.close(); //关闭容器
    }
}
