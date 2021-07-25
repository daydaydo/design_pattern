package com.otto.design.pattern.behavioral.interpreter;

/**
 * program: design_pattern
 * description: NumberInterpreter
 * *@author: gqchu
 * create: 2021-07-25 20:23
 **/
public class NumberInterpreter implements Interpreter{

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.valueOf(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
