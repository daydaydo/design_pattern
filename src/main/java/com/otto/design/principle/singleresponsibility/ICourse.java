package com.otto.design.principle.singleresponsibility;

/**
 * program: design_pattern
 * description: ICourse
 * *@author: gqchu
 * create: 2021-07-01 22:33
 **/
public interface ICourse {
    /** 或者课程的相关的信息 */
    String getCourseName();
    byte[] getCourseVideo();

    /** 课程管理上的 */
    void studyCourse();
    void refundCourse();
}