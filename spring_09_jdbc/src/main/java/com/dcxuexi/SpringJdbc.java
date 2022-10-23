package com.dcxuexi;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/***
 * @Title SpringJdbc
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/23 11:28
 * @Version 1.0.0
 */
public class SpringJdbc {
    public static void main(String[] args) throws IOException {

        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 2. jdbcConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("jdbcConfig.xml");

        // 3. 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        // 4. 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 5. 执行SqlSession对象执行查询，获取结果User
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User user = userDao.findById(8);
        System.out.println(user);

        // 6. 释放资源
        sqlSession.close();
    }
}
