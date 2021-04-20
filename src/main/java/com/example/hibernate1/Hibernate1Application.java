package com.example.hibernate1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.hibernate1")
public class Hibernate1Application {

    public static void main(String[] args) {
        SpringApplication.run(Hibernate1Application.class, args);
    }

}
