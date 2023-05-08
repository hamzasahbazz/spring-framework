package com.startup;

import org.springframework.context.annotation.*;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    //Direct wiring in case you do not do like this, it will print car as null.
    //one problem with this is that you create two object one is in car() method spring created and
    //second one is in person() method setCar(car()).
    /*
    @Bean
    Person person(){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car());
        return p;
    }

     */

    //Autowiring
    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car);
        return p;
    }
}
