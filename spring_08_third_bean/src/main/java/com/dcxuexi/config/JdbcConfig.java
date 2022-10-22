package com.dcxuexi.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.dcxuexi.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/***
 * @Title JdbcConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/22 20:47
 * @Version 1.0.0
 */
//@Configuration
public class JdbcConfig {
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/mybatis")
    private String url;
    @Value("root")
    private String userName;
    @Value("password")
    private String password;

    @Bean
    public DataSource dataSource(UserDao userDao){
        System.out.println(userDao);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }
}
