package com.otto.design.pattern.structural.adapter.objectadapter;

/**
 * program: design_pattern
 * description: Adapter
 * *@author: gqchu
 * create: 2021-07-19 22:32
 **/
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}