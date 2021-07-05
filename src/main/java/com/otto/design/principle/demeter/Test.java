package com.otto.design.principle.demeter;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-04 17:48
 **/
public class Test {
    public static void main(String[]args){
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}