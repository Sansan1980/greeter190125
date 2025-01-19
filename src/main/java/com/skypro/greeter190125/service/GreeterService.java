package com.skypro.greeter190125.service;

import org.springframework.stereotype.Service;

@Service
public class GreeterService {
    private HelloService helloService;

    public GreeterService(HelloService helloService) {
        this.helloService = helloService;
    }

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return helloService.randomHello() + ", Anonimus";
        }
        return helloService.randomHello()  +", " + name;
    }
}
