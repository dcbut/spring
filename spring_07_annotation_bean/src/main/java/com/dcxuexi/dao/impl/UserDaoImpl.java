package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/22 16:29
 * @Version 1.0.0
 */
@Repository
//@Scope设置bean的作用范围
//@Scope("prototype")
public class UserDaoImpl implements UserDao {
    public void select() {
        System.out.println("UserDao select, running ......");
    }

    @PostConstruct //在构造方法之后执行，替换 init-method
    public void init() {
        System.out.println("UserDao init ...");
    }

    @PreDestroy //在销毁方法之前执行,替换 destroy-method
    public void destroy() {
        System.out.println("UserDao destroy ...");
    }
}
