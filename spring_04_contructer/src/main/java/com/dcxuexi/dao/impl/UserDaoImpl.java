package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/18 20:24
 * @Version 1.0.0
 */
public class UserDaoImpl implements UserDao {
    private String userName;
    private Integer userAge;

    public UserDaoImpl(String userName, Integer userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public void selcet() {
        System.out.println("UserDao select, running ......");
        System.out.println("userName = " +userName+" , userAge = " + userAge);
    }
}
