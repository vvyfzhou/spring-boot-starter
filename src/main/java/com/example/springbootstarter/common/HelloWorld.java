package com.example.springbootstarter.common;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public HelloWorld() {
        System.out.println("HelloWorld!");
    }
}
