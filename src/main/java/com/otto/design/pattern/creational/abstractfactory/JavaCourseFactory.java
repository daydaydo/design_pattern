package com.otto.design.pattern.creational.abstractfactory;

/**
 * program: design_pattern
 * description: JavaCourseFactory
 * *@author: gqchu
 * create: 2021-07-06 23:07
 **/
public class JavaCourseFactory implements CourseFactory {

    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}