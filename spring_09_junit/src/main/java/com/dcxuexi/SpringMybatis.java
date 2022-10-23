package com.dcxuexi;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.domain.User;
import com.dcxuexi.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Title SpringMybatis
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/23 17:02
 * @Version 1.0.0
 */
public class SpringMybatis {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        User user = userService.findById(10);
        System.out.println(user);
    }
}
