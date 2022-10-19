package com.dcxuexi.dao.impl;

import com.dcxuexi.dao.UserDao;

import java.util.*;

/***
 * @Title UserDaoImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/18 22:48
 * @Version 1.0.0
 */
public class UserDaoImpl implements UserDao {

    private int[] array;
    private Set<String> set;
    private List<String> list;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void select() {
        System.out.println("UserDao select, running .....");
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("set = " + set);
        System.out.println("list = " + list);
        System.out.println("map = " + map);
        System.out.println("properties = "+ properties);

    }
}
