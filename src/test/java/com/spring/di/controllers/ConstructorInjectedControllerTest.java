package com.spring.di.controllers;

import com.spring.di.services.wai.PrimaryWaiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController ciController;
    @BeforeEach
    void setUp() {
        ciController = new ConstructorInjectedController(new PrimaryWaiService());
    }

    @Test
    void sayWaiRepeatedly() {
        ciController.sayWaiRepeatedly();
    }
}