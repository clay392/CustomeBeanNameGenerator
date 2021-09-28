package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    public void save() {
        System.out.println("实现了保存用户！");
    }
}
