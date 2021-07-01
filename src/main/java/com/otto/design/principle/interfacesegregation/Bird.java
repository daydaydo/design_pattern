package com.otto.design.principle.interfacesegregation;

/**
 * program: design_pattern
 * description: Bird
 * *@author: gqchu
 * create: 2021-07-01 23:31
 **/
public class Bird implements IAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        /** 鸟不一定会飞，比如鸵鸟 */
    }

    @Override
    public void swim() {
        /** 鸟不一定会游泳 */
    }
}