package com.springdemo.mvc;

public class User {
    private String userName;

//    public User(String userName, String password) {
//        this.userName = userName;
//        this.password = password;
//    }

    private String password;
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
