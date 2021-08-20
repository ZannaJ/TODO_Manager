package com.company.Controllers;

import com.company.dbhelper.DbConnection;
import com.company.Tasks.Tasks;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class ManagerController {
    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static boolean addNewTask() {

        // Prompt the user for data.
        System.out.print("Enter the name of the task: ");
        String task = scanner.next();

        System.out.print("Enter the value of priority: ");
        int priority = scanner.nextInt();

        try {

            ps = DbConnection.getConnection().prepareStatement("INSERT INTO Tasks(Task, Priority)" +
                    " VALUES('" + task + "', " + priority + ")");

            ps.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
