package com.otto.design.pattern.creational.singleton;

/**
 * program: design_pattern
 * description: ThreadLocalInstance
 * *@author: gqchu
 * create: 2021-07-14 22:42
 **/
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
            = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }
}
