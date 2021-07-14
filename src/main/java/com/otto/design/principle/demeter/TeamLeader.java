package com.otto.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * program: design_pattern
 * description: TeamLeader
 * *@author: gqchu
 * create: 2021-07-04 17:48
 **/
public class TeamLeader {
//    public void checkNumberOfCourses(List<Course> courseList) {
//        System.out.println("在线课程的数量是:"+courseList.size());
//    }

    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是:"+courseList.size());
    }
}
