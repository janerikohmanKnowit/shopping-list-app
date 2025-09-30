package com.example.shoppinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingListApplication.class, args);
        System.out.println("========================================");
        System.out.println("Shopping List App is running!");
        System.out.println("Open: http://localhost:8080");
        System.out.println("========================================");
    }
}
