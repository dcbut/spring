package com.dcxuexi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/***
 * @Title SpringConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/23 21:52
 * @Version 1.0.0
 */
@Configuration
@ComponentScan("com.dcxuexi")
@EnableAspectJAutoProxy
public class SpringConfig {
}
