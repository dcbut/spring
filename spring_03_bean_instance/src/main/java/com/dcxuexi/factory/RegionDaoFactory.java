package com.dcxuexi.factory;

import com.dcxuexi.dao.RegionDao;
import com.dcxuexi.dao.impl.RegionDaoImpl;

/***
 * @Title RegionDaoFactory
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/16 16:34
 * @Version 1.0.0
 */
//静态工厂创建对象
public class RegionDaoFactory {
    public static RegionDao getRegionDao(){
        System.out.println("factory setup....");//模拟必要的业务操作
        return new RegionDaoImpl();
    }
}
