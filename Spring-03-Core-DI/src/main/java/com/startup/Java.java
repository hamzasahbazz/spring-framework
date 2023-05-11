package com.startup;

import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
@AllArgsConstructor //by using this anotation, do not need to create constructor manually
public class Java {

    // field injection is the one way in this way is not recommended
//    @Autowired
//    OfficeHours officeHours;


    //Constructor Injection
    OfficeHours officeHours;
/*
    @Autowired
    // After Spring version 4.3 when you only have one constructor in the class, you can
    //  omit writing the @Autowired annotation
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
 */

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " +(20 + officeHours.getHours()));
    }
}
