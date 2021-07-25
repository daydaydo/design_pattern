package com.otto.design.pattern.behavioral.interpreter;

/**
 * program: design_pattern
 * description: AddInterpreter
 * *@author: gqchu
 * create: 2021-07-25 20:17
 **/
public class AddInterpreter implements Interpreter{

    private Interpreter firstExpression,secondExpression;
    public AddInterpreter(Interpreter firstExpression,Interpreter secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() +this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
