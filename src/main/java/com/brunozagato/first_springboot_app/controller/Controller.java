package com.brunozagato.first_springboot_app.controller;

import com.brunozagato.first_springboot_app.domain.User;
import com.brunozagato.first_springboot_app.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping
    public String helloWorld() {
        return service.HelloWorld("Bruno");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(
            @PathVariable("id") String id,
            @RequestBody User body,
            @RequestParam(value = "filter", defaultValue = "nothing") String filter
            ) {

        return "hello world post " + body.getName() + " " + id + " " + filter;
    }
}
