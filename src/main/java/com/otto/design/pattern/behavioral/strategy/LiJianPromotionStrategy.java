package com.otto.design.pattern.behavioral.strategy;

/**
 * program: design_pattern
 * description: LiJianPromotionStrategy
 * *@author: gqchu
 * create: 2021-07-25 19:49
 **/
public class LiJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程的价格直接减去配置的价格");
    }
}
