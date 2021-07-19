package com.otto.design.pattern.structural.decorator.v2;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-19 21:42
 **/
public class Test {
    public static void main(String[]args){
        ABattercake aBattercake;
        aBattercake = new Battercate();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc()+"价格为:"+aBattercake.cost());
    }
}