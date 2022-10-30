package com.dcxuexi.dao;

import com.dcxuexi.domain.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/***
 * @Title AccountDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/30 10:49
 * @Version 1.0.0
 */
public interface AccountDao {
    @Update("update account set money = money + #{money} where user_name = #{name}")
    public void inMoney(@Param("name")String name,@Param("money") Double money);


    @Update("update account set money = money - #{money} where user_name = #{name}")
    public void outMoney(@Param("name")String name,@Param("money") Double money);

    @Select("select id,user_name userName,money from account where user_name = #{name}")
    public Account userInfo(String name);
}
