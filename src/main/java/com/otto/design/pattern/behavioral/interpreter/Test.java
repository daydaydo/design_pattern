package com.otto.design.pattern.behavioral.interpreter;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-25 20:41
 **/
public class Test {
    public static void main(String[] args) {
        String inputStr = "5 100 11 + *";
        OttoExpressionParser expressionParser = new OttoExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果：" + result);
    }
}
