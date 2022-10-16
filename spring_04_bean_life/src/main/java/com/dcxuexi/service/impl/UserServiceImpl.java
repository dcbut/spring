package com.dcxuexi.service.impl;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.service.UserService;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/16 18:33
 * @Version 1.0.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void select() {
        System.out.println("User Service select, running ......");
        userDao.select();
    }

    public void setUserDao(UserDao userDao){
        System.out.println("User Service set .....");
        this.userDao = userDao;
    }

    //表示bean初始化对应的操作
    public void init(){
        System.out.println("User Service init, running ......");
    }
    //表示bean销毁前对应的操作
    public void destory(){
        System.out.println("User Service destory, running ......");
    }
}
