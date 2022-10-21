package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/21 21:36
 * @Version 1.0.0
 */
public class UserDaoImpl implements UserDao {
    public static UserDaoImpl getInstance() {
        return null;
    }

//    public UserDaoImpl() {
//        System.out.println("This is constructor .");
//    }

    public void select() {
        System.out.println("UserDao select, running ......");
    }
    public void init(){}
    public void destory(){}
}
