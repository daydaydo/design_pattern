package com.otto.design.pattern.creational.abstractfactory;

/**
 * program: design_pattern
 * description: JavaArticle
 * *@author: gqchu
 * create: 2021-07-06 23:08
 **/
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}