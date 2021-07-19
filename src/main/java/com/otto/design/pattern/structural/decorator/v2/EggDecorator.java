package com.otto.design.pattern.structural.decorator.v2;

/**
 * program: design_pattern
 * description: EggDecorator
 * *@author: gqchu
 * create: 2021-07-19 21:41
 **/
public class EggDecorator extends AbstractDecorator{

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
