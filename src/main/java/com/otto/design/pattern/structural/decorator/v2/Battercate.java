package com.otto.design.pattern.structural.decorator.v2;

/**
 * program: design_pattern
 * description: Battercate
 * *@author: gqchu
 * create: 2021-07-19 21:40
 **/
public class Battercate extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}