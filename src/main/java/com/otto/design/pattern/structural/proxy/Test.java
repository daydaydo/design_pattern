package com.otto.design.pattern.structural.proxy;

import com.otto.design.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-21 21:21
 **/
public class Test {
    public static void main(String[]args){
        Order order = new Order();
        order.setUserId(2);
        /** 这里没有采用spring自动注入的方式，而是采用了直接new的方式 */
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}