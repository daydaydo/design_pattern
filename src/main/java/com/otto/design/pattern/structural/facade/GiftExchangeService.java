package com.otto.design.pattern.structural.facade;

/**
 * program: design_pattern
 * description: GiftExchangeService
 * *@author: gqchu
 * create: 2021-07-15 23:19
 **/
public class GiftExchangeService {
    private QualifyService qualifyService  = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();


    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            /** 资格检验通过 */
            if (pointsPaymentService.pay(pointsGift)) {
                //如果积分支付成功,那么就是可以返回订单号了
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流订单系统下单成功，订单号是："+shippingOrderNo);
            }
        }
    }
}