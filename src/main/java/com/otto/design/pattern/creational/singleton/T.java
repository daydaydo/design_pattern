package com.otto.design.pattern.creational.singleton;

/**
 * program: design_pattern
 * description: T
 * *@author: gqchu
 * create: 2021-07-10 16:41
 **/
public class T implements Runnable{

    @Override
    public void run() {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        //LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton lazySingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);
    }
}
