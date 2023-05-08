package com.startup;

import lombok.*;
import org.springframework.beans.factory.annotation.*;

@Getter
@Setter
public class Person {
    private String name;
    private Car car;
}
