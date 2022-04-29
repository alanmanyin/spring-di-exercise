package com.spring.di.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    public String test() {
        System.out.println("Testing");
        return "return";
    }
}
