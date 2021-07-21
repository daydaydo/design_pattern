package com.otto.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-15 19:27
 **/
public class Test {
    public static void main(String[]args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(666666666L);
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
