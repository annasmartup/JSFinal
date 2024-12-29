package com.example.task_management.factory;

import com.example.task_management.model.Task;

public class UrgentTaskFactory implements TaskFactory {
    @Override
    public Task createTask(String title, String description) {
        return new Task(title, description, true);
    }
}

