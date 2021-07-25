package com.otto.design.pattern.behavioral.interpreter;

/**
 * program: design_pattern
 * description: MultiInterpreter
 * *@author: gqchu
 * create: 2021-07-25 20:21
 **/
public class MultiInterpreter implements Interpreter{
    private Interpreter firstExpression,secondExpression;
    public MultiInterpreter(Interpreter firstExpression,Interpreter secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
