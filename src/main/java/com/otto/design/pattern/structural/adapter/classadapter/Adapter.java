package com.otto.design.pattern.structural.adapter.classadapter;

/**
 * program: design_pattern
 * description: Adapter
 * *@author: gqchu
 * create: 2021-07-19 22:12
 **/
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}