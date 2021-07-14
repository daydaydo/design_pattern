package com.otto.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * program: design_pattern
 * description: Boss
 * *@author: gqchu
 * create: 2021-07-04 17:47
 **/
public class Boss {
//    public void commandCheckNumber(TeamLeader teamLeader) {
//        List<Course> courseList = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            courseList.add(new Course());
//        }
//        teamLeader.checkNumberOfCourses(courseList);
//    }


    public void commandCheckNumber(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
