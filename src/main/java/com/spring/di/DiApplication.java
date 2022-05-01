package com.spring.di;

import com.spring.di.controllers.ConstructorInjectedController;
import com.spring.di.controllers.PropertyInjectedController;
import com.spring.di.controllers.SetterInjectedController;
import com.spring.di.controllers.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

        System.out.println(Arrays.asList(ctx.getBeanDefinitionNames()));

        System.out.println("----- test -----");
        TestController controller = (TestController) ctx.getBean("testController");
        controller.test();

        System.out.println("----- property injected -----");
        PropertyInjectedController piController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        piController.sayWai();

        System.out.println("----- setter injected -----");
        SetterInjectedController siController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        siController.sayWaiAgain();

        System.out.println("----- constructor injected -----");
        ConstructorInjectedController ciController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        ciController.sayWaiRepeatedly();

    }

}
