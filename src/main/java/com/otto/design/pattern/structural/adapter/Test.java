package com.otto.design.pattern.structural.adapter;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-19 22:42
 **/
public class Test {
    public static void main(String[]args){
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}