package com.otto.design.principle.liskovSubstitution;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-04 20:56
 **/
public class Test {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth()+"length"+rectangle.getLength());
        }
        System.out.println("resize方法结束，width"+rectangle.getWidth()+"length"+rectangle.getLength());
    }
    /** 长方形 */
/*    public static void main(String[]args){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }*/
    /** 正方形 */
    public static void main(String[]args){
        Square square = new Square();
//        square.setLength(10);
//        resize(square);
    }
}