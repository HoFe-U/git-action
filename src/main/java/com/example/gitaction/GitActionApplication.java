package com.example.gitaction;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitActionApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitActionApplication.class, args);
        System.out.println("test");
    }

}
