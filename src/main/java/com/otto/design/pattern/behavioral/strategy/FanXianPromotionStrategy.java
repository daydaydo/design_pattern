package com.otto.design.pattern.behavioral.strategy;

/**
 * program: design_pattern
 * description: FanXianPromotionStrategy
 * *@author: gqchu
 * create: 2021-07-25 19:49
 **/
public class FanXianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("反现促销，返回的金额存放到网站用户的余额中");
    }
}
