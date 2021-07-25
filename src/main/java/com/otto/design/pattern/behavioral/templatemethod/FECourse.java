package com.otto.design.pattern.behavioral.templatemethod;

/**
 * program: design_pattern
 * description: FECourse
 * *@author: gqchu
 * create: 2021-07-25 16:28
 **/
public class FECourse extends ACourse {

    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }
}

