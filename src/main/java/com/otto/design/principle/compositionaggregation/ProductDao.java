package com.otto.design.principle.compositionaggregation;

/**
 * program: design_pattern
 * description: ProductDao
 * *@author: gqchu
 * create: 2021-07-04 21:22
 **/
public class ProductDao{
//    public void addProduct() {
//        String conn = super.getConnection();
//        System.out.println("使用"+conn+"增加产品");
//    }

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}