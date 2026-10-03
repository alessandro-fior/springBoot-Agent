package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SchedulingApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        AsyncTask async = ctx.getBean(AsyncTask.class);
        async.doAsync();
        Thread.sleep(3000);
        System.out.println("Main done");
        ((AnnotationConfigApplicationContext) ctx).close();
    }
}
