package com.otto.design.pattern.creational.singleton;

/**
 * program: design_pattern
 * description: LazySingleton
 * *@author: gqchu
 * create: 2021-07-10 16:38
 **/
public class LazySingleton {
    /** 懒汉模式的话，开始没有进行初始化 */
    private static LazySingleton lazySingleton = null;
    /** 构造器要进行私有化 */
    private LazySingleton(){

    }
    public synchronized static LazySingleton getInstance() {
        /** 这个是有线程安全的问题 */
        if (lazySingleton == null) {
            /**
             * 如果一个线程进来了，但是这个时候，在new实例的时候，阻塞了或者还没有new出实例，
             * 这个时候，另外一个线程判断lazySingleton依然是空的，那么就这时候，也进来了，
             * 那么这个时候，就是有线程安全问题的
             */
            lazySingleton =  new LazySingleton();
        }
        return lazySingleton;
    }
}
