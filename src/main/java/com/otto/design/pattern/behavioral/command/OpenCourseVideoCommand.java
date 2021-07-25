package com.otto.design.pattern.behavioral.command;

/**
 * program: design_pattern
 * description: OpenCourseVideoCommand
 * *@author: gqchu
 * create: 2021-07-25 21:41
 **/
public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}