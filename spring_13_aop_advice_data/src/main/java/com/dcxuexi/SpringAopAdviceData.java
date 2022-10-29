package com.dcxuexi;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Title SpringAopAdviceData
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 17:46
 * @Version 1.0.0
 */
public class SpringAopAdviceData {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = context.getBean(UserDao.class);
        String userInfo = userDao.userInfoById(10,"zhangsan");
        System.out.println("用户信息 ：" + userInfo);

    }
}
