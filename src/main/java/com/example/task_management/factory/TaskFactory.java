package com.example.task_management.factory;

import com.example.task_management.model.Task;

public interface TaskFactory {
    Task createTask(String title, String description);
}
