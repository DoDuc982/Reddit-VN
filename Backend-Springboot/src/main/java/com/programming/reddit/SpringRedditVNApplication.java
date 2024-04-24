package com.programming.reddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringRedditVNApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRedditVNApplication.class, args);
    }

}
