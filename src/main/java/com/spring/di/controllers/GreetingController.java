package com.spring.di.controllers;

import com.spring.di.services.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    @Autowired
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void welcome(){
        greetingService.greet();
    }
}
