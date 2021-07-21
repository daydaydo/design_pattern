package com.otto.design.pattern.structural.bridge;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-21 20:16
 **/
public class Test {
    public static void main(String[]args){
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}