package com.dcxuexi.service.impl;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.dao.impl.UserDaoImpl;
import com.dcxuexi.service.UserService;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/15 10:09
 * @Version 1.0.0
 */
public class UserServiceImpl implements UserService {

    //public UserDao userDao = new UserDaoImpl();
    //删除业务层中使用new的方式创建的dao对象
    private UserDao userDao ;

    public void save() {
        System.out.println("User Service save ....");
        userDao.save();
    }
    //提供对应的set方法
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

}
