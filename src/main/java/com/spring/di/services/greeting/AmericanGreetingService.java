package com.spring.di.services.greeting;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("US")
@Service("GreetingService")
public class AmericanGreetingService implements GreetingService{

    @Override
    public void greet() {
        System.out.println("Howdy, partner!");
    }
}
