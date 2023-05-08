package com.startup.stereotype_anotation;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan this annotation look in same package's classes
@ComponentScan(basePackages = "com.startup") // search all the packages in the same project
public class ConfigCourse {
}
