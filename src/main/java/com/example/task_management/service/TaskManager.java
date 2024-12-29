package com.example.task_management.service;

import com.example.task_management.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static final TaskManager INSTANCE = new TaskManager();
    private final List<Task> tasks = new ArrayList<>();

    private TaskManager() {}

    public static TaskManager getInstance() {
        return INSTANCE;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}