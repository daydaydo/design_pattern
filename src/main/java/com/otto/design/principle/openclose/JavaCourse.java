package com.otto.design.principle.openclose;

/**
 * program: design_pattern
 * description: JavaCourse
 * *@author: gqchu
 * create: 2021-06-30 19:24
 **/
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}