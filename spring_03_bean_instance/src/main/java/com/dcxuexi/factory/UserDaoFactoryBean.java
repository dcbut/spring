package com.dcxuexi.factory;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/***
 * @Title UserDaoFactoryBean
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/16 17:23
 * @Version 1.0.0
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中的创建对象的方法
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    //返回所创建类的class对象
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
