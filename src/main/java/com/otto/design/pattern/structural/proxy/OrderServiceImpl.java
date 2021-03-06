package com.otto.design.pattern.structural.proxy;

/**
 * program: design_pattern
 * description: OrderServiceImpl
 * *@author: gqchu
 * create: 2021-07-21 21:08
 **/
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        /** Spring会自己注入，我们这里就直接new出来了 */
        iOrderDao = new OrderDaoImpl();
        System.out.println("Service调用Dao层添加Order层");
        return iOrderDao.insert(order);
    }
}
