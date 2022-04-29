package com.spring.di.services;

public class WaiServiceImpl implements WaiService {
    @Override
    public void wai3(String additionalMsg) {
        System.out.println("喂!" + additionalMsg);
    }
}
