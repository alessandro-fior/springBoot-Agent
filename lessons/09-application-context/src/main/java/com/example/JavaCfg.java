package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaCfg {
    @Bean
    public HelloBean helloBean() {
        return new HelloBean();
    }
}
