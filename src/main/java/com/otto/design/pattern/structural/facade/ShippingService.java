package com.otto.design.pattern.structural.facade;

/**
 * program: design_pattern
 * description: ShippingService
 * *@author: gqchu
 * create: 2021-07-15 23:18
 **/
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        /** 物流系统对接逻辑 */
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}