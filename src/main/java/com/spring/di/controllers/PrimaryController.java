package com.spring.di.controllers;


import com.spring.di.services.PrimaryWaiService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {
    PrimaryWaiService primaryWaiService;

    public PrimaryController(PrimaryWaiService primaryWaiService) {
        this.primaryWaiService = primaryWaiService;
    }

    public void test() {
      primaryWaiService.wai3();
    }
}
