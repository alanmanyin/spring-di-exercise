package com.spring.di.services.greeting;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"SE", "default"})
@Service("GreetingService")
public class SwedishGreetingService implements GreetingService {
    @Override
    public void greet() {
        System.out.println("Tja, läget?");
    }
}
