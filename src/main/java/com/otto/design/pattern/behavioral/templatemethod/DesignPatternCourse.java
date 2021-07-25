package com.otto.design.pattern.behavioral.templatemethod;

/**
 * program: design_pattern
 * description: DesignPatternCourse
 * *@author: gqchu
 * create: 2021-07-25 16:28
 **/
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
