package com.spring.di.controllers;

import com.spring.di.services.WaiService;

public class PropertyInjectedController {
    public WaiService waiService;

    public void sayWai(){
        waiService.wai3("");
    }
}
