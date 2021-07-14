package com.otto.design.pattern.creational.abstractfactory;

/**
 * program: design_pattern
 * description: JavaVideo
 * *@author: gqchu
 * create: 2021-07-06 23:08
 **/
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}