package com.dcxuexi;

import com.dcxuexi.dao.OrderDao;
import com.dcxuexi.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Title AppForInstanceOrder
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/16 17:01
 * @Version 1.0.0
 */
public class AppForInstanceOrder {
    public static void main(String[] args) {
        //创建实例工厂对象
        //OrderDaoFactory orderDaoFactory = new OrderDaoFactory();
        //通过实例工厂对象创建对象
        //OrderDao orderDao = orderDaoFactory.getOrderDao();
        //orderDao.save();

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) context.getBean("orderDao");
        orderDao.save();
    }
}
