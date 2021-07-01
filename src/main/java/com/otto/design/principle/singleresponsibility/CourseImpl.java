package com.otto.design.principle.singleresponsibility;

/**
 * program: design_pattern
 * description: CourseImpl
 * *@author: gqchu
 * create: 2021-07-01 22:34
 **/
public class CourseImpl implements ICourseManager,ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}