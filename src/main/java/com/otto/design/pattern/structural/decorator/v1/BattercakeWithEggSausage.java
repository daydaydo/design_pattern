package com.otto.design.pattern.structural.decorator.v1;

/**
 * program: design_pattern
 * description: BattercakeWithEggSausage
 * *@author: gqchu
 * create: 2021-07-19 19:23
 **/
public class BattercakeWithEggSausage extends BattercakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc()+"一个香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}