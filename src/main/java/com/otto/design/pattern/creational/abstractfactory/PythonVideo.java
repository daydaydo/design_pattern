package com.otto.design.pattern.creational.abstractfactory;

/**
 * program: design_pattern
 * description: PythonVideo
 * *@author: gqchu
 * create: 2021-07-06 23:13
 **/
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python的视频");
    }
}