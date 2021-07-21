package com.otto.design.pattern.structural.facade;

/**
 * program: design_pattern
 * description: PointsPaymentService
 * *@author: gqchu
 * create: 2021-07-15 23:18
 **/
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        /** 扣减积分 */
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }
}