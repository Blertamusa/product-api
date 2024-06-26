package com.task_management_api.repostitories;

import com.task_management_api.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> { //trashegon metodat CRUD
}
