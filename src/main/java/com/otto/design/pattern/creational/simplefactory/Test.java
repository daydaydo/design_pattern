package com.otto.design.pattern.creational.simplefactory;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-05 23:52
 **/
public class Test {
    public static void main(String[]args){
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }c
//        video.product();


        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.product();
    }
}