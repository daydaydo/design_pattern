package com.otto.design.pattern.structural.decorator.v2;

/**
 * program: design_pattern
 * description: AbstractDecorator
 * *@author: gqchu
 * create: 2021-07-19 21:41
 **/
public class AbstractDecorator extends ABattercake{
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return aBattercake.cost();
    }
}
