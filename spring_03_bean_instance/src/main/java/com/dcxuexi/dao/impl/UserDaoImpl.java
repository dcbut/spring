package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/16 10:09
 * @Version 1.0.0
 */
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("User Dao save, running ......");
    }
    //无参构造函数
    public UserDaoImpl(){
        System.out.println("User Dao Impl constructor is running ......");
    }
}
