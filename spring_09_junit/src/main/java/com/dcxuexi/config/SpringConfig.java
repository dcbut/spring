package com.dcxuexi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/***
 * @Title SpringConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/23 17:03
 * @Version 1.0.0
 */
//配置类注解
@Configuration
//包扫描，主要扫描的是项目中的UserServiceImpl类
@ComponentScan("com.dcxuexi")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
