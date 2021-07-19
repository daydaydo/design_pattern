package com.otto.design.pattern.structural.facade;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-15 23:20
 **/
public class Test {
    public static void main(String[]args){
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointsGift);
    }
}
