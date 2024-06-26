package com.task_management_api.controllers;

import com.task_management_api.model.User;
import com.task_management_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User foundUser = userService.saveOrUpdateUser(user);
        return ResponseEntity.ok(foundUser);
    }
}

