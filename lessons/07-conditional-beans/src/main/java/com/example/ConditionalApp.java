package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionalApp {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService svc = ctx.getBean(MyService.class);
        System.out.println(svc.type());
    }
}
