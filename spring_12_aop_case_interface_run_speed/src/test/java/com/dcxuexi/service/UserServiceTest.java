package com.dcxuexi.service;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import java.util.List;

/***
 * @Title UserServiceTest
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 11:58
 * @Version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        List<User> userList = userService.findAll();
        System.out.println(userList);
        User user = userService.findByID(20);
        System.out.println(user.toString());
    }


}
