package com.startup.bean_annotation;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

public class StartupApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);
        FullTimeMentor ft = container.getBean(FullTimeMentor.class);

        ft.createAccount();

        String ss = container.getBean(String.class);
        System.out.println(ss);


    }
}
