package com.startup.bean_annotation;

import org.springframework.context.annotation.*;

@Configuration
public class ConfigAny {

    @Bean
    String str(){
        return "Quality Engineer";
    }

    @Bean
    Integer number(){
        return 100;
    }
}
