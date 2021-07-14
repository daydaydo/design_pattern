package com.otto.design.principle.openclose;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-06-30 19:24
 **/
public class Test {
    public static void main(String[]args){
        ICourse javaCourse = new JavaCourse(96, "Java 从零开始到企业级开发", 348d);
        System.out.println("课程Id：" + javaCourse.getId() + "课程名称：" + javaCourse.getName() + "课程价格：" + javaCourse.getPrice());
    }
}