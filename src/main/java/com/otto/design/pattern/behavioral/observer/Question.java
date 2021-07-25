package com.otto.design.pattern.behavioral.observer;

/**
 * program: design_pattern
 * description: Question
 * *@author: gqchu
 * create: 2021-07-25 21:06
 **/
public class Question {
    private String userName;
    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}