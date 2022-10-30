package com.dcxuexi.service;

import com.dcxuexi.domain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/***
 * @Title AccountService
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/30 10:55
 * @Version 1.0.0
 */
public interface AccountService {
    /**
     * 转账操作
     * @param out 传出方
     * @param in 转入方
     * @param money 金额
     */
    //配置当前接口方法具有事务
    //@Transactional
    public void transfer(String out,String in ,Double money)  throws IOException;

    public void userInfo(String name);
}
