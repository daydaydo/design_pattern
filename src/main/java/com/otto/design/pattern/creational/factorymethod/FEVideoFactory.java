package com.otto.design.pattern.creational.factorymethod;

/**
 * program: design_pattern
 * description: FEVideoFactory
 * *@author: gqchu
 * create: 2021-07-06 21:39
 **/
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}