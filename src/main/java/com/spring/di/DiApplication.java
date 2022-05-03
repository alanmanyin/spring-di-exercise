package com.spring.di;

import com.spring.di.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

        System.out.println("----- property injected -----");
        PropertyInjectedController piController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        piController.sayWai();

        System.out.println("----- setter injected -----");
        SetterInjectedController siController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        siController.sayWaiAgain();

        System.out.println("----- constructor injected -----");
        ConstructorInjectedController ciController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        ciController.sayWaiRepeatedly();

        System.out.println("----- primary bean -----");
        PrimaryController primaryController = (PrimaryController) ctx.getBean("primaryController");
        primaryController.test();

        System.out.println("----- greeting -----");
        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        greetingController.welcome();

        System.out.println("----- pet -----");
        PetController petController = (PetController) ctx.getBean("petController");
        petController.feedPet();

    }

}
