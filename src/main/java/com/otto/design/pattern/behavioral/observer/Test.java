package com.otto.design.pattern.behavioral.observer;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-25 21:07
 **/
public class Test {
    public static void main(String[]args){
        Course course = new Course("Java设计模式精讲");
        Teacher teacher = new Teacher("Alpha");

        course.addObserver(teacher);
        //业务逻辑代码
        Question question = new Question();
        question.setUserName("ldc");
        question.setQuestionContent("Java的主函数如何编写");

        course.produceQuestion(course, question);
    }
}