package com.example.springscheduledexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringScheduledExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringScheduledExampleApplication.class, args);
    }

}
