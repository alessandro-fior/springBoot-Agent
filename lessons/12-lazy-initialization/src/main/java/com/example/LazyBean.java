package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyBean {
    public LazyBean() {
        System.out.println("LazyBean created");
    }

    public void hello() {
        System.out.println("LazyBean.hello()");
    }
}
