package com.otto.design.pattern.behavioral.templatemethod;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-25 16:30
 **/
public class Test {
    public static void main(String[]args){
//        System.out.println("后端设计模式课程start--");
//        ACourse designPatternCourse = new DesignPatternCourse();
//        designPatternCourse.makeCourse();
//        System.out.println("后端设计模式课程end--");

        System.out.println("前端式课程start--");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end--");
    }
}
