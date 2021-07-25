package com.otto.design.pattern.structural.proxy.dynamicproxy;

import com.otto.design.pattern.structural.proxy.IOrderService;
import com.otto.design.pattern.structural.proxy.Order;
import com.otto.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-25 15:50
 **/
public class Test {
    public static void main(String[]args){
        Order order = new Order();
        order.setUserId(2);
        /** 这里没有采用spring自动注入的方式，而是采用了直接new的方式 */
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}
