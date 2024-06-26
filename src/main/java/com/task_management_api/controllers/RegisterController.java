package com.task_management_api.controllers;

import com.task_management_api.model.Register;
import com.task_management_api.services.impl.RegisterServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "*") // lejon kerkesa nga cdo origjin qe te kene qasje ne burimet e kontrollerit
public class RegisterController {

    private RegisterServiceImpl registerService;

    public RegisterController(RegisterServiceImpl registerService) {
        this.registerService = registerService;
    }

    @PostMapping
    public ResponseEntity<Register> createUser(@RequestBody Register user) {
        return ResponseEntity.ok(registerService.createUser(user));
    }
}
