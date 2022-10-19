package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/18 22:08
 * @Version 1.0.0
 */
public class UserDaoImpl implements UserDao {

    private String userName;
    private Integer userAge;

    public void select() {
        System.out.println("UserDao select, running ......");
    }
}
