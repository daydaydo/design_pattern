package com.otto.design.pattern.creational.builder.v2;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-07 21:13
 **/
public class Test {
    public static void main(String[]args){
        Course course = new Course.CourseBuilder()
                .builderCourseName("Java设计模式")
                .builderCoursePPT("Java设计模式PPT")
                .builderCourseVideo("Java设计模式视频")
                .builderCourseArticle("Java设计模式手记")
                .builderCourseQA("Java设计模式问答").build();
        System.out.println(course);
    }
}