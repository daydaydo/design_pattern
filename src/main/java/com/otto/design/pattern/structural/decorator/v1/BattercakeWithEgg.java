package com.otto.design.pattern.structural.decorator.v1;

/**
 * program: design_pattern
 * description: BattercakeWithEgg
 * *@author: gqchu
 * create: 2021-07-19 19:23
 **/
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }

}