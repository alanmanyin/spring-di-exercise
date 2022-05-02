package com.spring.di.controllers;

import com.spring.di.services.WaiService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    WaiService waiService;

    public ConstructorInjectedController(@Qualifier("repeatedWaiService") WaiService waiService) {
        this.waiService = waiService;
    }

    public void sayWaiRepeatedly(){
        waiService.wai3();
    }
}
