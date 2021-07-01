package com.otto.design.principle.singleresponsibility;

/**
 * program: design_pattern
 * description: Method
 * *@author: gqchu
 * create: 2021-07-01 22:37
 **/
public class Method {
    private void updateUserInfo(String userName, String address) {
        /** 这个是一个伪代码，传进来的进来的值进行一个更新 */
        userName = "Tom";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String... properties) {
        /** 这个是一个伪代码，传进来的进来的值进行一个更新 */
        userName = "Tom";
    }

    private void updateUserName(String userName) {
        userName = "Tom";
    }
    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address,boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }
        userName = "Tom";
        address = "beijing";
    }
}