package com.spring.di.controllers;

import com.spring.di.services.PrimaryWaiService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setWaiService(new PrimaryWaiService());
    }

    @Test
    void sayWaiAgain() {
        setterInjectedController.sayWaiAgain();
    }
}