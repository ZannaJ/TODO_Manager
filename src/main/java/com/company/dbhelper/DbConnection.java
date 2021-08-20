package com.company.dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection() {
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11431647", User.USERNAME.getValue(), User.PASSWORD.getValue());


        }catch (SQLException e) {
//            System.out.println("Unable to connect to database");
            e.printStackTrace();

        }
        return connection;
    }

}
