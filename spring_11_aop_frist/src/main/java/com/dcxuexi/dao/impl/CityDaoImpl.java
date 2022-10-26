package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.CityDao;
import org.springframework.stereotype.Repository;

/***
 * @Title CityDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/26 20:39
 * @Version 1.0.0
 */
@Repository
public class CityDaoImpl implements CityDao {
    public void update() {
        System.out.println("CityDao update, ......");
    }

    public void insert() {
        System.out.println("CityDao insert, ......");
    }
}
