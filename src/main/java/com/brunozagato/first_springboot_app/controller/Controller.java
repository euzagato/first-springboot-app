package com.brunozagato.first_springboot_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class Controller {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
