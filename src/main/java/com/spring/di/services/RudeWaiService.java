package com.spring.di.services;
import org.springframework.stereotype.Service;

@Service
public class RudeWaiService implements WaiService {
    @Override
    public void wai3() {
        System.out.println("喂! 點樣啊!?");
    }
}
