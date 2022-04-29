package com.spring.di.controllers;

import com.spring.di.services.WaiServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController ciController;
    @BeforeEach
    void setUp() {
        ciController = new ConstructorInjectedController(new WaiServiceImpl());
    }

    @Test
    void sayWaiRepeatedly() {
        ciController.sayWaiRepeatedly();
    }
}