package com.otto.design.pattern.behavioral.command;

/**
 * program: design_pattern
 * description: CourseVideo
 * *@author: gqchu
 * create: 2021-07-25 21:40
 **/
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }
    public void open() {
        System.out.println(this.name+"课程开放");
    }
    public void close() {
        System.out.println(this.name+"课程关闭");
    }
}