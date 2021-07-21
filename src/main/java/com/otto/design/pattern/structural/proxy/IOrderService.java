package com.otto.design.pattern.structural.proxy;

/**
 * program: design_pattern
 * description: IOrderService
 * *@author: gqchu
 * create: 2021-07-21 21:08
 **/
public interface IOrderService {
    /** 保存订单，参数为订单对象，返回值为生效行数 */
    int saveOrder(Order order);
}
