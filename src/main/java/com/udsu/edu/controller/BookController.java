package com.udsu.edu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "my friend") String name) {
        return String.format("Hello, %s!", name);
    }
}
