package com.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdEnv implements EnvService {
    @Override
    public String env() {
        return "PROD";
    }
}
