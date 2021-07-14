package com.otto.design.pattern.creational.abstractfactory;

/**
 * program: design_pattern
 * description: CourseFactory
 * *@author: gqchu
 * create: 2021-07-06 23:07
 **/
public interface CourseFactory {
    /** 获取视频 */
    Video getVideo();

    /** 获取手记 */
    Article getArticle();
}