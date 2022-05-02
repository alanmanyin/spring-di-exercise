package com.spring.di.services;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryWaiService implements WaiService {

    @Override
    public void wai3() {
        System.out.println("喂! 大哥!");
    }
}
