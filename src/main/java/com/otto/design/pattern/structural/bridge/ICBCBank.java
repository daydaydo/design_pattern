package com.otto.design.pattern.structural.bridge;

/**
 * program: design_pattern
 * description: ICBCBank
 * *@author: gqchu
 * create: 2021-07-21 20:14
 **/
public class ICBCBank extends Bank {
    /**
     * 组合的时候，可以通过构造器的方式来进行注入也可以通过set方法的方式来进行注入
     *
     * @param account
     */
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        return account;
    }
}