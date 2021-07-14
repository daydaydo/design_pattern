package com.otto.design.pattern.creational.factorymethod;

/**
 * program: design_pattern
 * description: JavaVideoFactory
 * *@author: gqchu
 * create: 2021-07-06 21:35
 **/
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
