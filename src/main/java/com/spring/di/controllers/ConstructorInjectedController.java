package com.spring.di.controllers;

import com.spring.di.services.WaiService;

public class ConstructorInjectedController {
    WaiService waiService;

    public ConstructorInjectedController(WaiService waiService) {
        this.waiService = waiService;
    }

    public void sayWaiRepeatedly(){
        waiService.wai3("喂!喂!");
    }
}
