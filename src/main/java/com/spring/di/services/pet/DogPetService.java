package com.spring.di.services.pet;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Dog")
@Service("PetService")
public class DogPetService implements PetService{

    @Override
    public void feed() {
        System.out.println("Woof!");
    }
}
