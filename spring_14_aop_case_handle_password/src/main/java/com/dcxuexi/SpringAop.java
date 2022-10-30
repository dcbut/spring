package com.dcxuexi;

import com.dcxuexi.config.SpringConfig;
import com.dcxuexi.service.ResourcesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @Title SpringAop
 * @Description TOTD
 * @Auter DongChuang  Resources
 * @Date 2022/10/29 21:46
 * @Version 1.0.0
 */
public class SpringAop {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService = context.getBean(ResourcesService.class);
        boolean b = resourcesService.openURL("https://pan.baidu.com/s/1AA14syG9sE4VAdTJMvgzzw", " 1234  ");
        System.out.println(b);
    }
}
