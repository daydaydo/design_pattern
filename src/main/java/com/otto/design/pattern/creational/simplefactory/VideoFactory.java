package com.otto.design.pattern.creational.simplefactory;

/**
 * program: design_pattern
 * description: VideoFactory
 * *@author: gqchu
 * create: 2021-07-05 23:52
 **/
public class VideoFactory {
    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new Python();
//        }
//        return null;
//    }
}