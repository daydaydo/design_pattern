package com.otto.design.principle.dependenceinversion;

/**
 * program: design_pattern
 * description: Tom
 * *@author: gqchu
 * create: 2021-06-30 20:18
 **/
public class Tom {
    //v1
//    public void studyJavaCourse() {
//        System.out.println("Tom在学习Java课程");
//    }
//    public void studyFECourse() {
//        System.out.println("Tom在学习FE课程");
//    }
//    public void studyPythonCourse() {
//        System.out.println("Tom在学习Python课程");
//    }

    //v2
//    public void studyCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }

    //v3
//    private ICourse iCourse;
//
//    public Tom(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//    /** 这里的方法，就只需要调用类成员变量ICourse里面的studyCourse()方法就可以了 */
//    public void studyCourse() {
//        iCourse.studyCourse();
//    }

    //v4
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }
}