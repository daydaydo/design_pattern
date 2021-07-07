package com.otto.design.pattern.creational.builder;

/**
 * program: design_pattern
 * description: Coach
 * *@author: gqchu
 * create: 2021-07-07 20:43
 **/
public class Coach {
    private CourseBuilder courseBuilder;
    /** 这里的CourseBuilder通过set的方式给注入进来 */
    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,
                             String courseVideo,String courseArticle,String courseQA) {
        this.courseBuilder.buildCourseName(courseName);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);

        return this.courseBuilder.makeCourse();
    }
}
