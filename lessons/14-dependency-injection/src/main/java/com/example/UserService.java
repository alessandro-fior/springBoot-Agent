package com.example;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    // Constructor injection (preferred)
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getUser(long id) {
        return repository.findById(id);
    }
}
