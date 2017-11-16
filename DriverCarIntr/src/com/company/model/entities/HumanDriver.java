package com.company.model.entities;

import com.company.model.entities.Human;

import java.time.LocalDate;

/**
 * HumanDriver
 * created on 14.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public interface HumanDriver {
    String name();
    LocalDate birthday();
    Human.Gender gender();
}
