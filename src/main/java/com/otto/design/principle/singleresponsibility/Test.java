package com.otto.design.principle.singleresponsibility;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-01 22:27
 **/
public class Test {
    public static void main(String[]args){
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}