package com.otto.design.pattern.creational.singleton;

/**
 * program: design_pattern
 * description: LazyDoubleCheckSingleton
 *
 * 如果线程过来，实例已经有值了，这个时候，
 * 就直接return了，就不用经过synchronized锁阻塞了，大幅度提高了性能
 *
 * *@author: gqchu
 * create: 2021-07-12 19:11
 **/
public class LazyDoubleCheckSingleton {
    /** 懒汉模式的话，开始没有进行初始化 */
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    /** 构造器要进行私有化 */
    private LazyDoubleCheckSingleton(){

    }
    public static LazyDoubleCheckSingleton getInstance() {
        //  第一重检查就是为了如果线程过来为空时，直接返回，不用经过锁
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                // 第二重检查是为了如果为空的话，给它进行实例化
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton =  new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
