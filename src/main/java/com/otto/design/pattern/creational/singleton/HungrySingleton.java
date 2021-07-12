package com.otto.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * program: design_pattern
 * description: HungrySingleton
 * *@author: gqchu
 * create: 2021-07-12 23:00
 **/
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /** 我们加上这样的一个方法 */
    private Object readResolve() {
        return hungrySingleton;
    }
}