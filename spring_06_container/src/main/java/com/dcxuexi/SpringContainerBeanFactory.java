package com.dcxuexi;

import com.dcxuexi.dao.UserDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/***
 * @Title SpringContainerBeanFactory
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/21 22:16
 * @Version 1.0.0
 */
public class SpringContainerBeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        UserDao userDao = factory.getBean("userDao", UserDao.class);
        userDao.select();
    }
}
