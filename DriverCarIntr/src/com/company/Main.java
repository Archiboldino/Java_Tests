package com.company;

import com.company.model.entities.*;
import com.company.model.service.Driver;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Human john = new Human("John" , LocalDate.now() , Human.Gender.MALE , Human.BloodGroup.FIRST);

        DriverLicense license = new DriverLicense(john,
                LocalDate.now(),
                Arrays.asList(DriverLicense.Category.A, DriverLicense.Category.D),
                LocalDate.of(1,2,14));

        Driver driverJohn = new Driver(john, license);

        System.out.println(driverJohn);
        System.out.println(driverJohn.getHuman().gender());
    }
}
