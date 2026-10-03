package com.example;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public String findById(long id) {
        return "User-" + id;
    }
}
