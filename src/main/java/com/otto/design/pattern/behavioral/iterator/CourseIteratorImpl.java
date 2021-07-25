package com.otto.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * program: design_pattern
 * description: CourseIteratorImpl
 * *@author: gqchu
 * create: 2021-07-25 17:22
 **/
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;
    private int position;
    private Course course;
    public CourseIteratorImpl(List courseList){
        this.courseList=courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程,位置是: "+position);
        course=(Course)courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse(){
        if(position< courseList.size()){
            return false;
        }
        return true;
    }
}

