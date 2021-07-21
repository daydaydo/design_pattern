package com.otto.design.pattern.structural.bridge;

/**
 * program: design_pattern
 * description: ABCBank
 * *@author: gqchu
 * create: 2021-07-21 20:13
 **/
public class ABCBank extends Bank {
    /**
     * 组合的时候，可以通过构造器的方式来进行注入也可以通过set方法的方式来进行注入
     *
     * @param account
     */
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        return account;
    }
}