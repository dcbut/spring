package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;
import org.springframework.stereotype.Repository;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 17:47
 * @Version 1.0.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    public String userInfoById(Integer id,String name) {
        System.out.println("user id = " + id + " , name = "+ name);

        //throw  new NullPointerException(); // 抛出异常

        return "id = " + id + " , name = "+ name;
    }
}
