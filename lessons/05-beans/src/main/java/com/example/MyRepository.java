package com.example;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public String find() {
        return "data";
    }
}
