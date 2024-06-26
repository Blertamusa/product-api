package com.task_management_api.services.impl;

import com.task_management_api.model.Register;
import com.task_management_api.repostitories.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl {
    @Autowired // per te injektuar instanca te kesaj klase, duke lejuar te veproj ne te dhenat permes metodave qe jane ne repository
    private RegisterRepository registerRepository;

    public Register createUser(Register user) {
        return registerRepository.save(user);
    }
}
