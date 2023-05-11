package com.startup;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

public class StartupApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

       Java java = container.getBean(Java.class);

       java.getTeachingHours();
    }

}
