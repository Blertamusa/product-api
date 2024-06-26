package com.task_management_api.services;

import com.task_management_api.model.User;
import com.task_management_api.repostitories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }
}
