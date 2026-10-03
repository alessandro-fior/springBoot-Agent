package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class HelloBean {
    public String say() {
        return "hello";
    }
}

public class XmlConfigApp {
    public static void main(String[] args) {
        // Show concept: prefer Java Config in modern code
        ApplicationContext ctxJava = new AnnotationConfigApplicationContext(JavaCfg.class);
        System.out.println(ctxJava.getBean(HelloBean.class).say());

        // XML concept (commented to avoid missing file issues)
        System.out.println("Java Config OK. XML equivalent: <bean id='helloBean' class='com.example.HelloBean'/>");
    }
}
