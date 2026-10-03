package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

@Configuration
class SpelConfig {
    @Value("#{2 + 3}")
    private int sum;

    @Value("#{calculator.add(5, 7)}")
    private int result;

    @Value("#{'Hello'.toUpperCase()}")
    private String upper;

    @Value("#{ T(java.lang.Math).PI }")
    private double pi;

    @Value("#{ result > 10 ? 'OK' : 'KO' }")
    private String status;

    @Bean
    public SpelValues spelValues() {
        return new SpelValues(sum, result, upper, pi, status);
    }
}

record SpelValues(int sum, int result, String upper, double pi, String status) {}

public class SpelApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class, SpelConfig.class);
        SpelValues values = ctx.getBean(SpelValues.class);
        System.out.println(values);

        // SpEL programmatic
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext();
        System.out.println(parser.parseExpression("'SpEL' + ' Works'").getValue());
        System.out.println(parser.parseExpression("100 * 2").getValue());
    }
}
