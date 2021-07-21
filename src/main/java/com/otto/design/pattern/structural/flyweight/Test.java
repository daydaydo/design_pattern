package com.otto.design.pattern.structural.flyweight;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-19 23:05
 **/
public class Test {
    private static final String departments[] = {"RD","QA","PM","BD"};

    public static void main(String[]args){
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
