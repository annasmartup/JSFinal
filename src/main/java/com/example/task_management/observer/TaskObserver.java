package com.example.task_management.observer;

import com.example.task_management.model.Task;

public interface TaskObserver {
    void update(Task task);
}