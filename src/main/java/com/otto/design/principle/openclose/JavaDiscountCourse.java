package com.otto.design.principle.openclose;

/**
 * program: design_pattern
 * description: JavaDiscountCourse
 * *@author: gqchu
 * create: 2021-06-30 19:38
 **/
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    /** 获取原价的方法 */
    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
