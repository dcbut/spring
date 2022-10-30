package com.dcxuexi.service.impl;

import com.dcxuexi.dao.LogDao;
import com.dcxuexi.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/***
 * @Title LogServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/30 15:49
 * @Version 1.0.0
 */
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    //propagation设置事务属性：传播行为设置为当前操作需要新事务
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void log(String out, String in, Double money) {
        logDao.insertLog("转账操作由"+out+"到"+in+",金额："+money);
    }
}
