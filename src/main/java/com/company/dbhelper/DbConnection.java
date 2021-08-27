package com.company.dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection() {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/finalproject6", "java_group6", "SGT_group6");


        }catch (SQLException e) {
//            System.out.println("Unable to connect to database");
            e.printStackTrace();

        }
        return connection;
    }

}
