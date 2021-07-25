package com.otto.design.pattern.behavioral.iterator;

/**
 * program: design_pattern
 * description: CourseAggregate
 * *@author: gqchu
 * create: 2021-07-25 17:22
 **/
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);
    /**获取迭代器 */
    CourseIterator getCourseIterator();
}

