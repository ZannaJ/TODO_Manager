package com.company.Tasks;

public class Tasks {
    private int id;
    private String task;
    private int priority;
    private String category;
    private String status;


    public Tasks() {

    }

    public Tasks(int id, String name, int age) {
        this.id = id;
        this.task = task;
        this.priority = priority;
        this.category = category;
        this.status = status;


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

    public void setStatus(String status) {
        this.status = status;
    }
}
