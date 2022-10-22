package com.dcxuexi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * @Title SpringConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/22 16:05
 * @Version 1.0.0
 */
@Configuration
@ComponentScan({"com.dcxuexi.dao","com.dcxuexi.service"})
public class SpringConfig {
}
