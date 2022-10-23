package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;
import org.springframework.stereotype.Repository;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/23 21:50
 * @Version 1.0.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    public void select() {
        //记录程序当前执行执行（开始时间）
        Long startTime = System.currentTimeMillis();
        //业务执行万次
        for (int i = 0;i<10000;i++) {
            System.out.println("UserDao select , running .... ");
        }
        //记录程序当前执行时间（结束时间）
        Long endTime = System.currentTimeMillis();
        //计算时间差
        Long totalTime = endTime-startTime;
        //输出信息
        System.out.println("执行万次消耗时间：" + totalTime + "ms");
    }

    public void insert() {
        System.out.println("UserDao insert, running ....");
    }

    public void update() {
        System.out.println("UserDao update, running ....");
    }

    public void delele() {
        System.out.println("UserDao delele, running ....");
    }
}
