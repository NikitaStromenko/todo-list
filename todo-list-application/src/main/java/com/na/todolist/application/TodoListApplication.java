package com.na.todolist.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.na"})
public class TodoListApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoListApplication.class);
    }
}
