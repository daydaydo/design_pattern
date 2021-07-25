package com.otto.design.pattern.behavioral.iterator;

/**
 * program: design_pattern
 * description: CourseIterator
 * *@author: gqchu
 * create: 2021-07-25 17:22
 **/
public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();

}