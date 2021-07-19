package com.otto.design.pattern.structural.facade;

/**
 * program: design_pattern
 * description: QualifyService
 * *@author: gqchu
 * create: 2021-07-15 23:18
 **/
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验"+pointsGift.getName()+"积分资格通过,库存通过");
        return true;
    }
}