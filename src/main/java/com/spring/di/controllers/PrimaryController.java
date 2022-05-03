package com.spring.di.controllers;


import com.spring.di.services.wai.PrimaryWaiService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {
    private final PrimaryWaiService primaryWaiService;

    public PrimaryController(PrimaryWaiService primaryWaiService) {
        this.primaryWaiService = primaryWaiService;
    }

    public void test() {
      primaryWaiService.wai3();
    }
}
