package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

/***
 * @Title ResourcesDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 21:47
 * @Version 1.0.0
 */
@Repository
public class ResourcesDaoImpl implements ResourcesDao {
    public boolean readResources(String url, String password) {
        System.out.println("密码长度 ："+password.length());
        //模拟校验
        return password.equals("1234");
    }
}
