package com.otto.design.principle.liskovSubstitution;

/**
 * program: design_pattern
 * description: Rectangle
 * *@author: gqchu
 * create: 2021-07-04 20:55
 **/
public class Rectangle implements Quadrangle{
    private long length;
    private long width;

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
