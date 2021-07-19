package com.otto.design.pattern.structural.adapter.objectadapter;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-19 22:33
 **/
public class Test {
    public static void main(String[]args){
        Target target = new ConcreteTarget();
        target.request();

        /** 现在，我们就来通过适配器类来进行实现 */
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}