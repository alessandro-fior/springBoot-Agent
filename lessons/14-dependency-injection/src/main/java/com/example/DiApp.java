package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiApp {
    public static void main(String[] args) {
        // Traditional (concept)
        // UserService svc = new UserService(new UserRepository()); // tight coupling

        // Spring DI
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService svc = ctx.getBean(UserService.class);
        System.out.println(svc.getUser(1));
    }
}
