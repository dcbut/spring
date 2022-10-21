package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/20 22:38
 * @Version 1.0.0
 */
public class UserDaoImpl implements UserDao {

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void select() {
        System.out.println("UserDao select , running ,,,,,,");
        System.out.println("userName : " + userName);
    }
}
