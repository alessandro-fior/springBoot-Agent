package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class RestTemplateApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        RestTemplate restTemplate = ctx.getBean(RestTemplate.class);

        try {
            String url = "https://jsonplaceholder.typicode.com/posts/1";
            Post post = restTemplate.getForObject(url, Post.class);
            System.out.println(post);
        } catch (Exception e) {
            System.out.println("Nota: chiamata HTTP fallita (network?), mostrando concetto:");
            System.out.println("RestTemplate.getForObject(...) per chiamate HTTP");
        }
    }
}
