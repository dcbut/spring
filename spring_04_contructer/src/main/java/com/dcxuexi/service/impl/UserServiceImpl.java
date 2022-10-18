package com.dcxuexi.service.impl;

import com.dcxuexi.dao.CityDao;
import com.dcxuexi.dao.UserDao;
import com.dcxuexi.service.UserService;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/18 20:26
 * @Version 1.0.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private CityDao cityDao;

    public UserServiceImpl(UserDao userDao,CityDao cityDao) {
        this.userDao = userDao;
        this.cityDao = cityDao;
    }

    public void userFromCity() {
        System.out.println("UserService userFromCity, running .....");
        userDao.selcet();
        cityDao.select();
    }
}
