package com.dcxuexi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/***
 * @Title SpringConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 17:47
 * @Version 1.0.0
 */
@Configuration
@ComponentScan("com.dcxuexi")
@EnableAspectJAutoProxy
public class SpringConfig {
}
