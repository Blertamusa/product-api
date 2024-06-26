package com.task_management_api.repostitories;

import com.task_management_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username); // për të verifikuar nëse një përdorues me një emër të caktuar ekziston në bazën e të dhënave.
}
