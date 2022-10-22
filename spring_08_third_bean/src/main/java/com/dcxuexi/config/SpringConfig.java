package com.dcxuexi.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/***
 * @Title SpringConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/22 20:33
 * @Version 1.0.0
 */
@Configuration
@ComponentScan("com.dcxuexi.dao")
@Import({JdbcConfig.class})
public class SpringConfig {
//    @Bean
//    public DataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/mybatis");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//        return dataSource;
//    }
}
