package com.otto.design.pattern.structural.composite;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-07-20 21:16
 **/
public class Test {
    public static void main(String[]args){
        CatalogComponent linuxCourse = new Course("Linux课程", 11);
        CatalogComponent windowsCourse = new Course("windows课程", 11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);
        CatalogComponent mmallCatalog1 = new Course("Java电商一期",55);
        CatalogComponent mmallCatalog2 = new Course("Java电商二期",66);
        CatalogComponent designPattern = new Course("Java设计模式",77);

        javaCourseCatalog.add(mmallCatalog1);
        javaCourseCatalog.add(mmallCatalog2);
        javaCourseCatalog.add(designPattern);

        CatalogComponent ldcMainCourseCatalog = new CourseCatalog("网站课程主目录",1);
        ldcMainCourseCatalog.add(linuxCourse);
        ldcMainCourseCatalog.add(windowsCourse);
        ldcMainCourseCatalog.add(javaCourseCatalog);

        ldcMainCourseCatalog.print();
    }
}
