package com.boot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot application
 * @author Shaun
 */
//To enable Spring Boot we need the following annotation
/*
 * This annotation will search the entire project for Spring components
 * and it will automatically configure accordingly
 * */
@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}