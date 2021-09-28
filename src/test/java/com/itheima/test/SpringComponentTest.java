package com.itheima.test;


import com.itheima.service.UserService;
import com.itheima.utils.LogUtil;
import config.SpringConfiguration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringComponentTest {

    @Test
    public void test(){
        //1、创建容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //2、获取对象
        UserService userService = ac.getBean("myuserService", UserService.class);
        //3、调用方法
        userService.save();

        //获取对象
        //AccountService accountService = ac.getBean("accountService",AccountService.class);
        //accountService.deleteAccount();

        //获取对象
        LogUtil logUtil = ac.getBean("mylogUtil", LogUtil.class);
        logUtil.printLog();
    }

}
