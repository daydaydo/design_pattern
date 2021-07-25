package com.otto.design.pattern.behavioral.command;

/**
 * program: design_pattern
 * description: CloseCourseVideoCommand
 * *@author: gqchu
 * create: 2021-07-25 21:41
 **/
public class CloseCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
