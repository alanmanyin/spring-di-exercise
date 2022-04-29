package com.spring.di.controllers;

import com.spring.di.services.WaiServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setWaiService(new WaiServiceImpl());
    }

    @Test
    void sayWaiAgain() {
        setterInjectedController.sayWaiAgain();
    }
}