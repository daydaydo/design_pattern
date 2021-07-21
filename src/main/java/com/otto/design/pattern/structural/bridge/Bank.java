package com.otto.design.pattern.structural.bridge;

/**
 * program: design_pattern
 * description: Bank
 * *@author: gqchu
 * create: 2021-07-21 20:06
 **/
public abstract class Bank {
    /** 只有子类能拿到这个Account的这个接口 */
    protected Account account;

    /** 组合的时候，可以通过构造器的方式来进行注入也可以通过set方法的方式来进行注入 */
    public Bank(Account account) {
        this.account = account;
    }

    /** 这里声明成和接口里面的方法名一致，只是方便理解，Bank里面的方法要委托给Account接口里面的方法 */
    abstract Account openAccount();

}