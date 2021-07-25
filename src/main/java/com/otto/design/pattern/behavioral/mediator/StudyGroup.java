package com.otto.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * program: design_pattern
 * description: StudyGroup
 * *@author: gqchu
 * create: 2021-07-25 21:56
 **/
public class StudyGroup {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()+"["+user.getName()+"]:"+message);
    }
}

