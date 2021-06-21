package com.raina.todo;


public class ToDoModel {


    private String Task;
    private int id, status;


    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
