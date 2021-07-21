package com.otto.design.pattern.structural.bridge;

/**
 * program: design_pattern
 * description: SavingAccount
 * *@author: gqchu
 * create: 2021-07-21 20:06
 **/
/** 活期账号 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}