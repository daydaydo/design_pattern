package com.otto.design.pattern.structural.proxy.staticproxy;

import com.otto.design.pattern.structural.proxy.db.DataSourceContextHolder;
import com.otto.design.pattern.structural.proxy.IOrderService;
import com.otto.design.pattern.structural.proxy.Order;
import com.otto.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * program: design_pattern
 * description: OrderServiceStaticProxy
 * *@author: gqchu
 * create: 2021-07-21 21:09
 **/
public class OrderServiceStaticProxy {
    /**  在代理类里面注入目标对象 */
    private IOrderService iOrderService;

    /** 我们要在这静态代理类里面增强这个方法 */
    public int saveOrder(Order order){
        beforeMethod(order);
        /** 如果这里有spring容器的话，就不用显示的new了 */
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    /** 我们要增强，我们就来写上一个before和after */
    private void beforeMethod(Order order){
        int userId = order.getUserId();
        /** 这里就是实现一个分库的功能,对userId取模2，这里就只会得到0或者是1 */
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");
        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}

