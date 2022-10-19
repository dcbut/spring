package com.dcxuexi.service.impl;

import com.dcxuexi.dao.CityDao;
import com.dcxuexi.dao.UserDao;
import com.dcxuexi.service.UserService;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/18 22:09
 * @Version 1.0.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private UserDao userDao2;
    private CityDao cityDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void setUserDao2(UserDao userDao2) {
        this.userDao2 = userDao2;
    }

    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    public void select() {
        System.out.println("UserService select, running ......");
        userDao.select();
        cityDao.select();
        userDao2.select();
    }
}
