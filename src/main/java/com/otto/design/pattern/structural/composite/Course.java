package com.otto.design.pattern.structural.composite;

/**
 * program: design_pattern
 * description: Course
 * *@author: gqchu
 * create: 2021-07-20 21:13
 **/
public class Course extends CatalogComponent{
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name :"+name+" price"+price);
    }
}