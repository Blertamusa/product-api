package com.task_management_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TaskDto {

    public long id;
    public String taskName;
    public String taskDescription;
    public String status;

}
