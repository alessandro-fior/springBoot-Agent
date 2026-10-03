package com.example;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    private int counter = 0;

    public int increment() {
        return ++counter;
    }
}
