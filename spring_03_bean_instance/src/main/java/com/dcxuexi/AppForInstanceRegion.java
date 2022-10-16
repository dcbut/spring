package com.dcxuexi;

import com.dcxuexi.dao.RegionDao;
import com.dcxuexi.factory.RegionDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Title AppForInstanceRegion
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/16 16:36
 * @Version 1.0.0
 */
public class AppForInstanceRegion {
    public static void main(String[] args) {
        // 通过静态工厂创建对象
        //RegionDao regionDao = RegionDaoFactory.getRegionDao();
        //regionDao.select();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        RegionDao regionDao = (RegionDao) context.getBean("regionDao");
        regionDao.select();
    }
}
