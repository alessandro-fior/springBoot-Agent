package com.example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    private int count = 0;

    @Scheduled(fixedRate = 1000)
    public void report() {
        if (count++ < 3) {
            System.out.println("Scheduled: " + System.currentTimeMillis());
        }
    }
}
