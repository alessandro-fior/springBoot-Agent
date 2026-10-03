package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfileApp {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        EnvService svc = ctx.getBean(EnvService.class);
        System.out.println(svc.env());
    }
}
