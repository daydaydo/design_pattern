package com.otto.design.pattern.creational.factorymethod;

/**
 * program: design_pattern
 * description: PythonVideoFactory
 * *@author: gqchu
 * create: 2021-07-06 21:35
 **/
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
