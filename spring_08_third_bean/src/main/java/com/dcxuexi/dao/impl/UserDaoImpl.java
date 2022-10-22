package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;
import org.springframework.stereotype.Repository;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/22 20:33
 * @Version 1.0.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    public void select() {
        System.out.println("UserDao select, running ..." );
    }
}
