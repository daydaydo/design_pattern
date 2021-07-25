package com.otto.design.pattern.behavioral.strategy;

/**
 * program: design_pattern
 * description: EmptyPromotionStrategy
 * *@author: gqchu
 * create: 2021-07-25 20:02
 **/
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}
