package com.otto.design.pattern.creational.builder;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-07 20:48
 **/
public class Test {
    public static void main(String[]args){
        /** 利用多态，抽象类的引用指向子类的实现 */
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        /** 这里利用set方法注入进去 */
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java设计模式", "Java设计模式PPT", "Java设计模式视频", "Java设计模式手记", "Java设计模式问答");
        System.out.println(course);
    }
}