package com.dcxuexi;

import com.dcxuexi.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import javax.swing.*;

/***
 * @Title SpringThirdBean
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/22 20:32
 * @Version 1.0.0
 */
public class SpringThirdBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
