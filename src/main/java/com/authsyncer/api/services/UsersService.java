package com.authsyncer.api.services;

import org.springframework.stereotype.Service;

@Service
public class UsersService {
    public String existsByEmail(String email) {
        // Implement the logic to check if the user exists by email
        return "User exists with email: " + email;
    }
}
