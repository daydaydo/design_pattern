package com.otto.design.principle.interfacesegregation;

/**
 * program: design_pattern
 * description: Dog
 * *@author: gqchu
 * create: 2021-07-01 23:30
 **/
//public class Dog implements IAnimalAction {
//    @Override
//    public void eat() {
//
//    }
//
//    @Override
//    public void fly() {
//        /** 狗不会飞，这里是会有一个空的实现在这里 */
//    }
//
//    @Override
//    public void swim() {
//
//    }
//}
public class Dog implements ISwimAnimalAction,IEatAnimalAction{

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}