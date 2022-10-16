package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/16 18:32
 * @Version 1.0.0
 */
public class UserDaoImpl implements UserDao {
    public void select() {
        System.out.println("User Dao select, running ......");
    }
    //表示bean初始化对应的操作
    public void init(){
        System.out.println("User Dao init, running ......");
    }
    //表示bean销毁前对应的操作
    public void destory(){
        System.out.println("User Dao destory, running ......");
    }
}
