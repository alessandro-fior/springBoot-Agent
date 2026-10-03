package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppProperties {
    @Value("${app.name}")
    private String name;

    @Value("${app.version}")
    private String version;

    @Value("${server.port}")
    private int port;

    @Override
    public String toString() {
        return "AppProperties{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", port=" + port +
                '}';
    }
}
