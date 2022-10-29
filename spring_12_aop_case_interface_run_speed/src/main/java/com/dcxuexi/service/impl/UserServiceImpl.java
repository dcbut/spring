package com.dcxuexi.service.impl;

import com.dcxuexi.dao.UserDao;
import com.dcxuexi.domain.User;
import com.dcxuexi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @Title UserServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 11:42
 * @Version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findByID(Integer id) {
        return userDao.findByID(id);
    }

    public Integer insertUser(User user) {
        return userDao.insertUser(user);
    }

    public Integer updateUser(User user) {
        return userDao.updateUser(user);
    }

    public Integer deleleById(Integer id) {
        return userDao.deleleById(id);
    }
}
