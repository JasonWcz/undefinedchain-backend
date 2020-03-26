package com.undefinedchain.project.core;

import com.undefinedchain.project.model.User;


public class UserContext {
        private static ThreadLocal<String> userContext = new ThreadLocal<>();
    public static void setUserContext(String uid) {
        UserContext.userContext.set(uid);
    }
    public static String getUserContext() {
        return userContext.get();
    }
    public  static  void removeUser(){

        userContext.remove();
    }
}