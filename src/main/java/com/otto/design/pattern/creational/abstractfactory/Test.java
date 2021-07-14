package com.otto.design.pattern.creational.abstractfactory;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-06 23:16
 **/
public class Test {
    public static void main(String[]args){
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        /** 只要是从Java产品族里面拿的肯定是Java的视频和Java的手记 */
        article.produce();
        video.produce();
    }
}
