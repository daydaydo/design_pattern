package com.otto.design.principle.dependenceinversion;

/**
 * program: design_pattern
 * description: Test
 * *@author: gqchu
 * create: 2021-06-30 20:20
 **/
public class Test {
//    v1
//    public static void main(String[]args){
//        Tom tom = new Tom();
//        tom.studyJavaCourse();
//        tom.studyFECourse();
//    }

    //v2
//    public static void main(String[] args) {
//        Tom tom = new Tom();
//        tom.studyCourse(new JavaCourse());
//        tom.studyCourse(new FECourse());
//    }

    //v3
//    public static void main(String[]args){
//        Tom tom = new Tom(new JavaCourse());
//        tom.studyCourse();
//    }

        //v4
        public static void main(String[]args){
            Tom tom = new Tom();
            tom.setiCourse(new JavaCourse());
            tom.studyCourse();

            tom.setiCourse(new FECourse());
            tom.studyCourse();
        }
}
