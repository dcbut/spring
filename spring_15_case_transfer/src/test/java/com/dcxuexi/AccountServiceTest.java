package com.dcxuexi;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/***
 * @Title AccountServiceTest
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/30 11:09
 * @Version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void test() throws IOException {
        accountService.userInfo("ahmenggu");
        accountService.userInfo("fjwqdz");
        accountService.transfer("ahmenggu","fjwqdz",20D);
        System.out.println("转账操作后 ：");
        accountService.userInfo("ahmenggu");
        accountService.userInfo("fjwqdz");
    }
}
