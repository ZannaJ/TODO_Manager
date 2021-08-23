package com.company;

import com.company.Controllers.ManagerController;
import com.company.Login.Login;

public class Main {
    public static void main(String[] args) {
 //       System.out.println(Login.userSignUp() ? "Added a new user." : "Can't add a new user.");
//        System.out.println(ManagerController.addNewTask() ? "Successfully added new task" : "Failed to add a new task. ");
        System.out.println(Login.login() ? "Sucessfully logged in" : "Failed to login in");


    }
}
