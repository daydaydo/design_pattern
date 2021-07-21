package com.otto.design.pattern.structural.adapter.classadapter;

/**
 * program: design_pattern
 * description: ConcreteTarget
 * *@author: gqchu
 * create: 2021-07-19 22:12
 **/
/** 具体的实现类 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}