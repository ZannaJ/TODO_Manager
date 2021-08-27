package com.company.Tasks;
import java.sql.Date;

public class Tasks {
    private int id;
    private String task;
    private int priority;
    private String category;
    private String status;
    private Date deadline; // added on 23.08.2021
    private int user_id; // added on 23.08.2021


    public Tasks() {

    }



    public Tasks(int id, String name, int age) {
        this.id = id;
        this.task = task;
        this.priority = priority;
        this.category = category;
        this.status = status;
        this.deadline = deadline; // added on 23.08.2021
        this.user_id = user_id; // added on 23.08.2021

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) { this.status = status; }

    public Date getDeadline() { return deadline; } // added on 23.08.2021

    public void setDeadline(Date deadline) { this.deadline = deadline; } // added on 23.08.2021

    public int getUser_id() { return user_id; } // added on 23.08.2021

    public void setUser_id(int user_id) { this.user_id = user_id; } // added on 23.08.2021


}
