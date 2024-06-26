package com.task_management_api.repostitories;

import com.task_management_api.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register,Long> {
}
