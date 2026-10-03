package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTemplateApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        JdbcTemplate jdbc = ctx.getBean(JdbcTemplate.class);

        List<User> users = jdbc.query("SELECT id, name FROM users",
                (rs, rowNum) -> new User(rs.getInt("id"), rs.getString("name")));
        users.forEach(System.out::println);

        jdbc.update("INSERT INTO users (id, name) VALUES (?, ?)", 3, "Luca");
        System.out.println("After insert: " + jdbc.queryForObject("SELECT COUNT(*) FROM users", Integer.class));
    }
}
