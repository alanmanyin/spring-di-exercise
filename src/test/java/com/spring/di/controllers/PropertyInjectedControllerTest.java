package com.spring.di.controllers;

import com.spring.di.services.WaiServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.waiService = new WaiServiceImpl();
    }

    @Test
    void sayWai() {
        propertyInjectedController.sayWai();
    }
}