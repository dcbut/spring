package com.dcxuexi.dao;

import com.dcxuexi.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/***
 * @Title UserDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/23 11:53
 * @Version 1.0.0
 */
public interface UserDao {

    @Select("select user_id userId,email,user_name userName,branch_name branchName from platform_user")
    List<User> findAll();

    @Select("select user_id userId,email,user_name userName,branch_name branchName  from platform_user where user_id = #{id}")
    User findById(Integer id);


}
