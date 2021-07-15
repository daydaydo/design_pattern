package com.otto.design.pattern.creational.prototype.abstractprototype;

/**
 * program: design_pattern
 * description: A
 * *@author: gqchu
 * create: 2021-07-15 19:26
 **/
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}