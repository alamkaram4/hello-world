// src/main/java/com/example/demo/GreetingController.java
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${greeting.message}")
    private String message;

    @GetMapping("/greeting")
    public String greeting() {
        return message;
    }
}

