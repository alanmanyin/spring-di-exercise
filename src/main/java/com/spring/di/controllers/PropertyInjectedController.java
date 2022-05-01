package com.spring.di.controllers;

import com.spring.di.services.WaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public WaiService waiService;

    public void sayWai(){
        waiService.wai3("");
    }
}
