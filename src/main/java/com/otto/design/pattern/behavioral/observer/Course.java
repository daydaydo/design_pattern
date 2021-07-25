package com.otto.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * program: design_pattern
 * description: Course
 * *@author: gqchu
 * create: 2021-07-25 21:06
 **/
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question) {
        System.out.println(question.getUserName()+"在"+course.getCourseName()+"提交了一个问题 ");
        setChanged();
        notifyObservers(question);
    }
}
