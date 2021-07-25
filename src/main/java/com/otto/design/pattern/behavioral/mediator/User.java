package com.otto.design.pattern.behavioral.mediator;

/**
 * program: design_pattern
 * description: User
 * *@author: gqchu
 * create: 2021-07-25 21:56
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this,message);
    }
}

