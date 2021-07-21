package com.otto.design.pattern.structural.flyweight;

/**
 * program: design_pattern
 * description: Manager
 * *@author: gqchu
 * create: 2021-07-19 23:02
 **/
public class Manager implements Employee {

    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }
    /** 我们可以在外部来重置年终报告 */
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}