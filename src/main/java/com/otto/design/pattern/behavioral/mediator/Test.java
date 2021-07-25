package com.otto.design.pattern.behavioral.mediator;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-25 21:56
 **/
public class Test {
    public static void main(String[] args) {
        User ldc = new User("ldc");
        User ghl = new User("ghl");

        ldc.sendMessage("hey!ghl");
        ghl.sendMessage("hey!ldc");
    }
}
