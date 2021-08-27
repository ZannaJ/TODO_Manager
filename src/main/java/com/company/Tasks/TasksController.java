
// Code below added on 23.08.2021

package com.company.Tasks;

import com.company.dbhelper.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.Scanner;

public class TasksController {

    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static boolean addNewTask() {

        System.out.println("Please enter the new task (max. 500 symbols): ");
        String task = scanner.nextLine();


        System.out.println("Enter the task priority number 1, 2 or 3: ");
        System.out.println("NOTE: priority number 1 - high importance, 2 - medium importance, or 3 - low priority.");
        int priority = scanner.nextInt();

        System.out.println("Enter the task category: "); // user can create his own category if needed e.g.: shopping, holidays, work etc.
        String category = scanner.next();

        System.out.println("Enter the one of the statuses 'Have to do', 'In progress' or 'Done': ");
        String status = scanner.next();

        System.out.println("Enter the date YYYY-MM-DD (deadline) till when task has to be finished (if any): ");
        String deadline = scanner.next();

//        System.out.println("Enter the user ID: ");
//        String User_ID = scanner.next();

        try {
        //    ps = DbConnection.getConnection().prepareStatement("INSERT INTO tasks(ID, Task, Priority, Category, Status, Deadline, User_ID) VALUES ('" + task + "', '" + priority + "', '" + category + "', '" + status + "', '"+ deadline + "', " + User_ID + ")");
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO Tasks(Task, Priority, Category, Status, Deadline) VALUES ('" + task + "', '" + priority + "', '" + category + "', '" + status + "', '" + deadline + "')");
            ps.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void editTask (){

        System.out.println("Enter your task ID");
        int id = scanner.nextInt();

        System.out.println("You can now update your: task, priority, category, status, deadline.");

        System.out.println("Enter the field you want to edit: \n");
        String field = scanner.next();

        System.out.println("Enter the updated value: \n");
        String fieldUpdate = scanner.next();
        fieldUpdate += scanner.nextLine();


        try {
            ps = DbConnection.getConnection().prepareStatement("UPDATE Tasks SET " + field + " = '" + fieldUpdate + "' WHERE ID = " + id);
            ps.execute();
            System.out.println("Successfully updated field");
        } catch (SQLException e) {
            System.out.println("Failed to updated field");
            e.printStackTrace();
        }

    }


}
