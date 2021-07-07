package com.otto.design.pattern.creational.builder;

/**
 * program: design_pattern
 * description: CourseBuilder
 * *@author: gqchu
 * create: 2021-07-07 20:42
 **/
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}