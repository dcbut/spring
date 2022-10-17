package com.dcxuexi.service.impl;

import com.dcxuexi.dao.CityDao;
import com.dcxuexi.dao.UserDao;
import com.dcxuexi.service.UserService;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/17 21:52
 * @Version 1.0.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private CityDao cityDao;

    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void selectInfo() {
        System.out.println("UserService selectInfo, running ......");
        userDao.selectInfo();
        cityDao.fromCity();
    }

}
