package com.task_management_api.mappers;


import com.task_management_api.dto.TaskDto;
import com.task_management_api.model.Task;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {
    public Task toEntity(TaskDto taskDto) {
        var entity = new Task();
        entity.setId(taskDto.getId());
        entity.setTaskName(taskDto.getTaskName());
        entity.setTaskDescription(taskDto.getTaskDescription());
        entity.setStatus(taskDto.getStatus());
        return entity;
    }
    public TaskDto toDto(Task taskEntity) {
        var dto =  new TaskDto();
        dto.setId(taskEntity.getId());
        dto.setTaskName(taskEntity.getTaskName());
        dto.setTaskDescription(taskEntity.getTaskDescription());
        dto.setStatus(taskEntity.getStatus());
        return dto;
    }
}
