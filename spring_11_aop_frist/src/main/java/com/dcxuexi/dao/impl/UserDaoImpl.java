package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;
import org.springframework.stereotype.Repository;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/24 20:31
 * @Version 1.0.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    public void select() {
        System.out.println(System.currentTimeMillis());
        System.out.println("UserDao select, ......");
    }

    public void update() {
        System.out.println("UserDao update, ......");
    }

    public void insert(){
        System.out.println("UserDao insert, ......");
    }
}











