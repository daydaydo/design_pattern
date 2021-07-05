package com.otto.design.principle.liskovSubstitution;

/**
 * program: design_pattern
 * description: Square
 * *@author: gqchu
 * create: 2021-07-04 20:55
 **/
public class Square implements Quadrangle{
    private long sidelength;

    @Override
    public long getWidth() {
        return sidelength;
    }

    @Override
    public long getLength() {
        return sidelength;
    }

    public long getSidelength() {
        return sidelength;
    }

    public void setSidelength(long sidelength) {
        this.sidelength = sidelength;
    }
}