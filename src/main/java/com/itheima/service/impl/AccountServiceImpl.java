package com.itheima.service.impl;

import com.itheima.service.AccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    public void deleteAccount() {
        System.out.println("删除了账户");
    }
}
