package com.startup.stereotype_anotation;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

public class StartupApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCourse.class);

        Java java = container.getBean(Java.class);
        java.getTeachingHours();
    }
}
