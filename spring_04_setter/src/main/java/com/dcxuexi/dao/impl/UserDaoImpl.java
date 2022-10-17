package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;

/***
 * @Title UserDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/17 21:50
 * @Version 1.0.0
 */
public class UserDaoImpl implements UserDao {

    private String userName;
    private Integer age;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void selectInfo() {
        System.out.println("UserDao selectInfo, running ,,,,,,,");
        System.out.println("userName = " + userName + " ; age = " + age + " .");
    }
}
