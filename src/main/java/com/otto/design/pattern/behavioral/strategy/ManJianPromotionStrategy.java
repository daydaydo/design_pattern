package com.otto.design.pattern.behavioral.strategy;

/**
 * program: design_pattern
 * description: ManJianPromotionStrategy
 * *@author: gqchu
 * create: 2021-07-25 19:49
 **/
public class ManJianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200减20元");
    }
}