package com.otto.design.principle.compositionaggregation;

/**
 * program: design_pattern
 * description: MySQLConnection
 * *@author: gqchu
 * create: 2021-07-04 21:25
 **/
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}