package com.otto.design.pattern.behavioral.interpreter;

/**
 * program: design_pattern
 * description: OperatorUtil
 * *@author: gqchu
 * create: 2021-07-25 20:28
 **/
public class OperatorUtil {
    public static boolean isOperator(String symbol){
        return (symbol.equals("+") || symbol.equals("*"));
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression ,Interpreter secondExpression,String symbol){
        if(symbol.equals("+")){
            return new AddInterpreter(firstExpression,secondExpression);
        } else if(symbol.equals("*")){
            return new MultiInterpreter(firstExpression,secondExpression);
        }
        return null;
    }
}
