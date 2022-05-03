package com.spring.di.services.pet;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Cat")
@Service("PetService")
public class CatPetService implements PetService{
    @Override
    public void feed() {
        System.out.println("Meow!");
    }
}
