package com.company.Controllers;

import com.company.dbhelper.DbConnection;
import com.company.Tasks.Tasks;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Scanner;
import java.sql.Date;


public class ManagerController {
    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;

    public void setDate() {
        java.sql.Date todaysDate = new java.sql.Date(new java.util.Date().getTime());

        int futureDay =1;

        java.sql.Date futureDate = this.addDays(todaysDate, futureDay);

        System.out.println("Deadline " + futureDate);

    }

    public static Date addDays(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        return new Date(c.getTimeInMillis());
    }

    public static Date subtractDays(Date date, int days) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, -days);
        return new Date(c.getTimeInMillis());
    }
}
