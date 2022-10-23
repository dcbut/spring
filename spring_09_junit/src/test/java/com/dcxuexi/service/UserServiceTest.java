package com.dcxuexi.service;


import com.dcxuexi.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/***
 * @Title UserServiceTest
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/23 18:03
 * @Version 1.0.0
 */
//设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring环境对应的配置类
@ContextConfiguration(classes = {SpringConfig.class}) //加载配置类
//@ContextConfiguration(locations={"classpath:applicationContext.xml"})//加载配置文件
public class UserServiceTest {
    //支持自动装配注入bean
    @Autowired
    private UserService userService;

    @Test
    public void testfindAll(){
        System.out.println(userService.findAll());
    }

    @Test
    public void testFindById(){
        System.out.println(userService.findById(8));
    }


}
