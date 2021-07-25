package com.otto.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * program: design_pattern
 * description: VideoApprover
 * *@author: gqchu
 * create: 2021-07-25 22:23
 **/
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频，不批准，流程结束");
            return;
        }
    }
}