package com.example;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Set;

public class ValidationApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ValidationConfig.class);
        Validator validator = ctx.getBean(Validator.class);

        User valid = new User("Alice", "alice@example.com", 25);
        Set<ConstraintViolation<User>> v1 = validator.validate(valid);
        System.out.println("Valid user violations: " + v1.size());

        User invalid = new User("", "bad-email", 16);
        Set<ConstraintViolation<User>> v2 = validator.validate(invalid);
        System.out.println("Invalid user violations: " + v2.size());
        v2.forEach(cv -> System.out.println(cv.getPropertyPath() + ": " + cv.getMessage()));
    }
}
