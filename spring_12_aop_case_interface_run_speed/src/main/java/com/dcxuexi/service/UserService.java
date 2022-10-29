package com.dcxuexi.service;

import com.dcxuexi.domain.User;

import java.util.List;

/***
 * @Title UserService
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 11:41
 * @Version 1.0.0
 */
public interface UserService {
    public List<User> findAll();
    public User findByID(Integer id);
    public Integer insertUser(User user);
    public Integer updateUser(User user);
    public Integer deleleById(Integer id);
}
