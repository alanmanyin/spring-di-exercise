package com.spring.di.controllers;

import com.spring.di.services.pet.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public void feedPet(){
        petService.feed();
    }
}
