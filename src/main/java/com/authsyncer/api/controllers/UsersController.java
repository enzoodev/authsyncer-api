package com.authsyncer.api.controllers;

import com.authsyncer.api.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
    private final UsersService usersService;

    public String existsByEmail(String email) {
        return usersService.existsByEmail(email);
    }
}
