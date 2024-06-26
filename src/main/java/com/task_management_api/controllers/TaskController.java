package com.task_management_api.controllers;

import com.task_management_api.dto.TaskDto;
import com.task_management_api.services.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/task")
@CrossOrigin(origins = "*")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService= taskService;
    }

    @GetMapping
    public List<TaskDto> getAllTasks() {
        return taskService.getAll();
    }

    @GetMapping("/{id}")
    public TaskDto getById(@PathVariable long id) {
        return taskService.findById(id);
    }

    @PostMapping
    public void addTask(@RequestBody TaskDto newTask) {
        taskService.addTask(newTask);
    }

    @PutMapping("/{id}")
    public void updateTask(@PathVariable long id, @RequestBody TaskDto updatedTask) {
        taskService.editTask(id, updatedTask);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id) {
        taskService.removeById(id);

    }
}
