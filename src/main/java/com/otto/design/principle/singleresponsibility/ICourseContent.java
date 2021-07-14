package com.otto.design.principle.singleresponsibility;

/**
 * program: design_pattern
 * description: ICourseContent
 * *@author: gqchu
 * create: 2021-07-01 22:33
 **/
public interface ICourseContent {
    /** 或者课程的相关的信息 */
    String getCourseName();
    byte[] getCourseVideo();
}