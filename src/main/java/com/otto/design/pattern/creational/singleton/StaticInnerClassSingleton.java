package com.otto.design.pattern.creational.singleton;

/**
 * program: design_pattern
 * description: StaticInnerClassSingleton
 * *@author: gqchu
 * create: 2021-07-12 22:50
 **/
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){

    }
}