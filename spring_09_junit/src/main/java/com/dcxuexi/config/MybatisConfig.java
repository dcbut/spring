package com.dcxuexi.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/***
 * @Title MybatisConfig
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/23 17:18
 * @Version 1.0.0
 */
public class MybatisConfig {
    //定义Bean，返回SqlSessionFactoryBean，用户生成SqlSessionFactory对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //设置模型类的别名扫描
        sqlSessionFactoryBean.setTypeAliasesPackage("com.dcxuexi.domain");
        // 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    //定义Bean，返回MapperScannerConfigurer 对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.dcxuexi.dao");
        return mapperScannerConfigurer;
    }
}
