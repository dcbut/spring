package com.dcxuexi.service.impl;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.dao.impl.UserDaoImpl;
import com.dcxuexi.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/22 12:02
 * @Version 1.0.0
 */
//@Component
@Repository
//@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void select() {
        System.out.println("UserService select, running ......");
        userDao.select();
    }
}
