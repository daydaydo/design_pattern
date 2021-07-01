package com.otto.design.principle.dependenceinversion;

/**
 * program: design_pattern
 * description: FECourse
 * *@author: gqchu
 * create: 2021-06-30 20:22
 **/
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Tom在学习FE课程");
    }
}