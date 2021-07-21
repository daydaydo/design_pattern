package com.otto.design.pattern.structural.proxy;

/**
 * program: design_pattern
 * description: OrderDaoImpl
 * *@author: gqchu
 * create: 2021-07-21 21:08
 **/
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加order成功");
        return 1;
    }
}