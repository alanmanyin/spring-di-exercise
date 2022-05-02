package com.spring.di.controllers;

import com.spring.di.services.WaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("simpleWaiService")
    public WaiService waiService;

    public void sayWai(){
        waiService.wai3();
    }
}
