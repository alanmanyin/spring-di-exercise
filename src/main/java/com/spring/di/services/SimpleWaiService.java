package com.spring.di.services;
import org.springframework.stereotype.Service;

@Service
public class SimpleWaiService implements WaiService {
    @Override
    public void wai3() {
        System.out.println("喂!");
    }
}
