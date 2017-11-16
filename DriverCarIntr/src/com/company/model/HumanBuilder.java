package com.company.model;

import com.company.model.entities.Human;

import java.time.LocalDate;

/**
 * HumanBuilder
 * created on 16.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class HumanBuilder {
    private String name;
    private LocalDate birthDate;
    private Human.Gender gender;
    private Human.BloodGroup bloodGroup;

    public Human build() {
        return new Human(name, birthDate, gender, bloodGroup);
    }


    public HumanBuilder name(String name) {
        this.name = name;
        return this;
    }

    public HumanBuilder birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public HumanBuilder gender(Human.Gender gender) {
        this.gender = gender;
        return this;
    }

    public HumanBuilder bloodGroup(Human.BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }
}
