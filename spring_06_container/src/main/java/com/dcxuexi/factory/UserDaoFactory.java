package com.dcxuexi.factory;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/***
 * @Title UserDaoFactory
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/21 22:34
 * @Version 1.0.0
 */
public class UserDaoFactory implements FactoryBean<UserDao> {


    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    public Class<UserDao> getObjectType() {
        return UserDao.class;
    }
}
