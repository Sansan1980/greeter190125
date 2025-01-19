package com.skypro.greeter190125.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class HelloService {
    private final Random random;

    public HelloService() {
        this.random = new Random();
    }

    public String randomHello() {
        return switch (random.nextInt(1, 5)) {
            case 1-> "Hello";
            case 2-> "Privet";
            case 3-> "Salyt";
            default -> "Hi";
        };
    }

}
