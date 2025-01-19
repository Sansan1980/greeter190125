package com.skypro.greeter190125.controller;

import com.skypro.greeter190125.service.GreeterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeter")
public class GreeterController {
    private GreeterService greeterService;

    public GreeterController(GreeterService greeterService) {
        this.greeterService = greeterService;
    }
    @GetMapping("/greet")
    public String greet(@RequestParam(value = "Name", required = false) String name) {
        return greeterService.greet(name);
    }
}
