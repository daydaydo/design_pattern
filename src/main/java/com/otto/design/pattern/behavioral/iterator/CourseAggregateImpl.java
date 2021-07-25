package com.otto.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * program: design_pattern
 * description: CourseAggregateImpl
 * *@author: gqchu
 * create: 2021-07-25 17:22
 **/
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
