package com.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevEnv implements EnvService {
    @Override
    public String env() {
        return "DEV";
    }
}
