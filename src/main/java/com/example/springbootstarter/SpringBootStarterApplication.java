package com.example.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class SpringBootStarterApplication {



    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterApplication.class, args);
        JavaConfig jc = new JavaConfig();
        System.out.println("1");
    }

}
