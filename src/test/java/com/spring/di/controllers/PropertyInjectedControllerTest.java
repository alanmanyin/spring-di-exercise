package com.spring.di.controllers;

import com.spring.di.services.PrimaryWaiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.waiService = new PrimaryWaiService();
    }

    @Test
    void sayWai() {
        propertyInjectedController.sayWai();
    }
}