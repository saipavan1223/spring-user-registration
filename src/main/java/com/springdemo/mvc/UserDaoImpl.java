package com.springdemo.mvc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    User user = new User();
    Connection connection = null;
    @Override
    public void register() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/userdetails?" +
            "user=root&password=mySql1223!");

            if(connection != null ){
                System.out.println("Db connection is successful");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
