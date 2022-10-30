package com.dcxuexi.service.impl;

import com.dcxuexi.dao.ResourcesDao;
import com.dcxuexi.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * @Title ResourcesServiceImpl
 * @Description TOTD
 * @Auter DongChuang
 * @Date 2022/10/29 21:48
 * @Version 1.0.0
 */
@Service
public class ResourcesServiceImpl implements ResourcesService {

    @Autowired
    private ResourcesDao resourcesDao;

    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url,password);
    }
}
