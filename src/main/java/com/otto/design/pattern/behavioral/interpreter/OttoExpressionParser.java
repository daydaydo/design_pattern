package com.otto.design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * program: design_pattern
 * description: OttoExpressionParser
 * *@author: gqchu
 * create: 2021-07-25 20:26
 **/
public class OttoExpressionParser {
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)){
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈：%d" , numberExpression));
            } else {
                //是运算符号，可以计算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("入栈：%d 和 %d" , firstExpression , secondExpression));
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression,secondExpression,symbol);
                System.out.println(String.format("应用运算符：%s" , operator));
                int result = operator.interpret();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈：%d" , resultExpression));
            }
        }
        int result = stack.pop().interpret();
        return result;
    }
}
