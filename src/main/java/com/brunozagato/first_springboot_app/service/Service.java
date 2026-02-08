package com.brunozagato.first_springboot_app.service;

@org.springframework.stereotype.Service
public class Service {

    public String HelloWorld(String name) {
        return "Hello World " + name;
    }
}
