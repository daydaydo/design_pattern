package com.otto.design.pattern.creational.abstractfactory;

/**
 * program: design_pattern
 * description: PythonCourseFactory
 * *@author: gqchu
 * create: 2021-07-06 23:13
 **/
public class PythonCourseFactory implements CourseFactory{

    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}