package com.otto.design.pattern.structural.bridge;

/**
 * program: design_pattern
 * description: DepositAccount
 * *@author: gqchu
 * create: 2021-07-21 20:06
 **/
/** 定期的账号 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}