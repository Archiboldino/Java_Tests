package com.company;

import com.company.model.entities.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Human john = Human.getBuilder()
                    .name("John the Builder")
                    .birthDate(LocalDate.now())
                    .bloodGroup(Human.BloodGroup.FIRST)
                    .gender(Human.Gender.MALE).build();

        System.out.println(john);
    }
}
