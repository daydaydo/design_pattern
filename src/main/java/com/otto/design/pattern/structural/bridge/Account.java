package com.otto.design.pattern.structural.bridge;

/**
 * program: design_pattern
 * description: Account
 * *@author: gqchu
 * create: 2021-07-20 23:04
 **/
public interface Account {
    /** 打开我们的账号，打开账号，就要返回账号 */
    Account openAccount();

    /** 打开我们的账号，查看为什么账户类型，是定期类型还是活期类型 */
    void showAccountType();

}