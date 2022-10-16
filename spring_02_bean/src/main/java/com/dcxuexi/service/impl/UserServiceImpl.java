package com.dcxuexi.service.impl;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.dao.impl.UserDaoImpl;
import com.dcxuexi.service.UserService;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/15 17:40
 * @Version 1.0.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void save() {
        System.out.println("User Service save, running .....");
        userDao.save();
    }


    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }
}
