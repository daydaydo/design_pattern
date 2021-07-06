package com.otto.design.pattern.creational.abstractfactory;

/**
 * program: design_pattern
 * description: PythonArticle
 * *@author: gqchu
 * create: 2021-07-06 23:12
 **/
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
