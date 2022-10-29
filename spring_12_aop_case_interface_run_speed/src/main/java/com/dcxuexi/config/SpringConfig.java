package com.dcxuexi.config;

import org.springframework.context.annotation.*;

/***
 * @Title SpringConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 11:46
 * @Version 1.0.0
 */
@Configuration
@ComponentScan("com.dcxuexi")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
