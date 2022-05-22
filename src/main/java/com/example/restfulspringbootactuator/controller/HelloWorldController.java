package com.example.restfulspringbootactuator.controller;

import com.example.restfulspringbootactuator.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello-world")
    public Greeting greeting(@RequestParam(required = false, value = "name", defaultValue = "World") String name) {
        System.out.println("===Hello World===");
        return new Greeting(counter.incrementAndGet(), String.format("Hello, %s!", name));
    }
}
