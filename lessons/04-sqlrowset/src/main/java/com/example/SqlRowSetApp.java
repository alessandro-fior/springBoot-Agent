package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.HashMap;
import java.util.Map;

public class SqlRowSetApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        JdbcTemplate jdbcTemplate = ctx.getBean(JdbcTemplate.class);

        System.out.println("Query via JdbcTemplate:");
        jdbcTemplate.query("SELECT id, name FROM employees", rs -> {
            System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
        });

        // SqlRowSet example
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("SELECT id, name FROM employees ORDER BY id");
        System.out.println("\nQuery via SqlRowSet:");
        while (rowSet.next()) {
            System.out.println(rowSet.getInt("id") + ": " + rowSet.getString("name"));
        }

        // SimpleJdbcCall (conceptual; no real stored proc in H2 here, just illustration)
        SimpleJdbcCall call = ctx.getBean(SimpleJdbcCall.class);
        System.out.println("\nSimpleJdbcCall bean created: " + call.getClass().getSimpleName());
    }
}
