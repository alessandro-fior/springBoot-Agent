package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyApp {
    public static void main(String[] args) {
        System.out.println("Creating context...");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Context created");
        System.out.println("Accessing LazyBean...");
        LazyBean lazy = ctx.getBean(LazyBean.class);
        lazy.hello();
    }
}
