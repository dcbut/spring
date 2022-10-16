package com.dcxuexi.factory;

import com.dcxuexi.dao.OrderDao;
import com.dcxuexi.dao.impl.OrderDaoImpl;

/***
 * @Title OrderDaoFactory
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/16 16:59
 * @Version 1.0.0
 */
public class OrderDaoFactory {
    public OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
