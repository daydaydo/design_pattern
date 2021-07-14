package com.otto.design.principle.compositionaggregation;

/**
 * program: design_pattern
 * description: OracleConnection
 * *@author: gqchu
 * create: 2021-07-04 21:25
 **/
public class OracleConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "Oracle数据库连接";
    }
}
