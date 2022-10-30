package com.dcxuexi.dao;

import org.apache.ibatis.annotations.Insert;

/***
 * @Title LogDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/30 15:47
 * @Version 1.0.0
 */
public interface LogDao {

    @Insert("insert into log (info,createDate) values(#{info},now())")
    public void insertLog(String string);
}
