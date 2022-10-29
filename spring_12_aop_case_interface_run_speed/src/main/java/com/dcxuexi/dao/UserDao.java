package com.dcxuexi.dao;

import com.dcxuexi.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/***
 * @Title UserDao
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 11:30
 * @Version 1.0.0
 */
public interface UserDao {
    @Select("select user_id userId, email, user_name userName, branch_name branchName  from platform_user ")
    public List<User> findAll();

    @Select("select user_id userId, email, user_name userName, branch_name branchName  from platform_user where user_id = #{id}")
    public User findByID(Integer id);

    @Insert("insert into platform_user(user_id,email,user_name,branch_name)values(#{userId},#{email},#{userName},#{branchName})")
    public Integer insertUser(User user);

    @Update("update platform_user set user_name = #{userName} , email = #{email} , branch_name = #{branchName} where user_id = #{userId}")
    public Integer updateUser(User user);

    @Delete("delete from platform_user where user_id = #{id}")
    public Integer deleleById(Integer id);

}
