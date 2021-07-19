package com.otto.design.pattern.structural.decorator.v2;

/**
 * program: design_pattern
 * description: SausageDecorator
 * *@author: gqchu
 * create: 2021-07-19 21:41
 **/
public class SausageDecorator extends AbstractDecorator{

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}