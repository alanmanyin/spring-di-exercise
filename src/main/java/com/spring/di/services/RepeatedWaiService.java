package com.spring.di.services;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RepeatedWaiService implements WaiService {
    @Override
    public void wai3() {
        System.out.println("圍! 威! 喂!");
    }
}
