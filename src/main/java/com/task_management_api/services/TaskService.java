package com.task_management_api.services;

import com.task_management_api.dto.TaskDto;

import java.util.List;

public interface TaskService {
    void addTask(TaskDto taskDto);
    void editTask(long id, TaskDto updatedTask);
    void removeById(long id);
    TaskDto findById(long id);
    List<TaskDto> getAll();
}
