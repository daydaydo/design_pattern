package com.otto.design.pattern.creational.builder.v2;

/**
 * program: design_pattern
 * description: Course
 * *@author: gqchu
 * create: 2021-07-07 21:12
 **/
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    /** 问题和答案 */
    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQA = courseBuilder.courseQA;
    }

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        /** 问题和答案 */
        private String courseQA;

        public CourseBuilder builderCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }
        public CourseBuilder builderCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }
        public CourseBuilder builderCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }
        public CourseBuilder builderCourseArticle(String courseArticle) {
            this.courseArticle = courseArticle;
            return this;
        }
        public CourseBuilder builderCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
