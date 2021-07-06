package com.otto.design.pattern.creational.factorymethod;

/**
 * program: design_pattern
 * description: FEVideo
 * *@author: gqchu
 * create: 2021-07-06 21:39
 **/
public class FEVideo extends Video {
    @Override
    public void product() {
        System.out.println("录制前端课程视频");
    }
}