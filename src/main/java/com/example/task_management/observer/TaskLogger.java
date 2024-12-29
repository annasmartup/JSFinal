package com.example.task_management.observer;

import com.example.task_management.model.Task;

public class TaskLogger implements TaskObserver {
    @Override
    public void update(Task task) {
        System.out.println("Task updated: " + task.getTitle());
    }
}