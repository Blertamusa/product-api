package com.task_management_api.services.impl;

import com.task_management_api.dto.TaskDto;
import com.task_management_api.mappers.TaskMapper;
import com.task_management_api.repostitories.TaskRepository;
import com.task_management_api.services.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    public TaskServiceImpl(TaskRepository taskRepository, TaskMapper taskMapper) {
        this.taskRepository = taskRepository;
        this.taskMapper = taskMapper;
    }
    @Override
    public void addTask(TaskDto taskDto) {
        var entity = taskMapper.toEntity(taskDto); // kthimi i produktit nga dto ne entitet
        taskRepository.save(entity);
    }
    @Override
    public void editTask(long id, TaskDto updatedTask) {
        var modifyEntity = taskRepository.findById(id);
        if (modifyEntity.isEmpty())
            throw new RuntimeException("Product not found");

        var entity = modifyEntity.get();
        entity.setTaskName(updatedTask.getTaskName());
        entity.setTaskDescription(updatedTask.getTaskDescription());
        entity.setStatus(updatedTask.getStatus());

        taskRepository.save(entity);
    }


    @Override
    public void removeById(long id) {
        taskRepository.deleteById(id);

    }

    @Override
    public TaskDto findById(long id) {
        var entity = taskRepository.findById(id);
        if (entity.isEmpty())
            throw new RuntimeException("Task not found");
        var dto = taskMapper.toDto(entity.get()); //  Ky hap përfshin transformimin e entitetit në një objekt për transferim të të dhënave.
        return dto;
    }

    @Override
    public List<TaskDto> getAll() {
        return taskRepository.findAll().stream().map(taskMapper::toDto).toList();
        // stream perdoret per konvertimin e listes se entiteteve ne nje rrjedhe
        //map perdoret per mi kthy cdo entitet te produktit ne dto permes klases product mapper
    }
}
