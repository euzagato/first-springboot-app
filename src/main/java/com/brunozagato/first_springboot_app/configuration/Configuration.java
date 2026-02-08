package com.brunozagato.first_springboot_app.configuration;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public String helloWorld() {
        return "Hello world";
    }

}
