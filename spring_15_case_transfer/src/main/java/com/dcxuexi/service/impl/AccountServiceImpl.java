package com.dcxuexi.service.impl;

import com.dcxuexi.dao.AccountDao;
import com.dcxuexi.dao.LogDao;
import com.dcxuexi.domain.Account;
import com.dcxuexi.service.AccountService;
import com.dcxuexi.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.rmi.runtime.Log;

import java.io.IOException;

/***
 * @Title AccountServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/30 10:56
 * @Version 1.0.0
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogService logService;

    //@Transactional(rollbackFor = {IOException.class})
    @Transactional
    public void transfer(String out, String in, Double money)  throws IOException {
        try {
            accountDao.outMoney(out,money);
            int i = 1/0; // 这个异常事务会回滚
            //if(true){
                //throw new IOException(); //这个异常事务就不会回滚
            //}
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out, in, money);
        }

    }

    public void userInfo(String name) {
        Account account = accountDao.userInfo(name);
        System.out.println(account);
    }
}
