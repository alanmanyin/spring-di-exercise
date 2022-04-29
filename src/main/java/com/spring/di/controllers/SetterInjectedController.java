/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.spring.di.controllers;

import com.spring.di.services.WaiService;

public class SetterInjectedController {
    private WaiService waiService;

    public void setWaiService(WaiService waiService) {
        this.waiService = waiService;
    }

    public void sayWaiAgain(){
        waiService.wai3("點樣?");
    }
}
