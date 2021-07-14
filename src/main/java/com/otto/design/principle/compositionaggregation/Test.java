package com.otto.design.principle.compositionaggregation;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-04 21:22
 **/
public class Test {
//    public static void main(String[]args){
//        ProductDao productDao = new ProductDao();
//        productDao.addProduct();
//    }

    public static void main(String[]args){
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();
    }
}