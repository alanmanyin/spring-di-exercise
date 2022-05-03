package com.spring.di.services.greeting;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("HK")
@Service("GreetingService")
public class HongKongGreetingService implements GreetingService{
    @Override
    public void greet() {
        System.out.println("喂，靚仔!");
    }
}
