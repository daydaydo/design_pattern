package com.otto.design.pattern.behavioral.strategy;

/**
 * program: design_pattern
 * description: PromotionActivity
 * *@author: gqchu
 * create: 2021-07-25 19:49
 **/
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}