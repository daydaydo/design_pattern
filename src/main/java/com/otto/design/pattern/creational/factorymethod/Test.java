package com.otto.design.pattern.creational.factorymethod;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-05 23:52
 **/
public class Test {
    public static void main(String[]args){
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.product();
    }
}