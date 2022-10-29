package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;
import org.springframework.stereotype.Repository;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/27 20:28
 * @Version 1.0.0
 */
@Repository
public class UserDaoImpl implements UserDao {

    public void method(){
        // 代码 1   ##前置通知的位置
        try {
            // 代码 2   ##前置通知的位置

            // 方法业务代码  ## 要增强的方法

            // 代码 3   ##返回后通知的位置

        } catch (Exception e){
            // 代码 4   ##异常抛出通知的位置
        }
        // 代码 5   ##后置通知的位置
    }


    public void  select() {
        System.out.println("UserDao select, running .....");
    }

    public int update() {
        System.out.println("UserDao update, running ......");
        //int i = 1/0;
        return 99;
    }
}
