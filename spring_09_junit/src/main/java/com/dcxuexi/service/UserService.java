package com.dcxuexi.service;

import com.dcxuexi.domain.User;

import java.util.List;

/***
 * @Title UserService
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/23 11:57
 * @Version 1.0.0
 */
public interface UserService {

    List<User> findAll();

    User findById(Integer id);

}
