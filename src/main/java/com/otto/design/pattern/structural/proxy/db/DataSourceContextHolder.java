package com.otto.design.pattern.structural.proxy.db;

/**
 * program: design_pattern
 * description: DataSourceContextHolder
 * *@author: gqchu
 * create: 2021-07-21 21:09
 **/
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType) {
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType() {
        return (String)CONTEXT_HOLDER.get();
    }

    public static void clearDBType() {
        CONTEXT_HOLDER.remove();
    }
}
