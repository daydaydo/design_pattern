package com.otto.design.pattern.behavioral.chainofresponsibility;

/**
 * program: design_pattern
 * description: 批准者
 * *@author: gqchu
 * create: 2021-07-25 22:22
 **/
public abstract class Approver {
    /** 责任链的核心就是在类里面包含了一个自己同样类型的一个对象 */
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course) ;
}

