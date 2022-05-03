package com.spring.di.services.pet;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"Turtle","default"})
@Service("PetService")
public class TurtlePetService implements PetService{
    @Override
    public void feed() {
        System.out.println("...");
    }
}
