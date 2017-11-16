package com.company.model.service;

import com.company.model.entities.DriverLicenceDriver;
import com.company.model.entities.HumanDriver;

/**
 * Driver
 * created on 14.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Driver {
    private HumanDriver human;
    private DriverLicenceDriver licenceDrive;

    public Driver(HumanDriver human, DriverLicenceDriver licenceDrive) {
        this.human = human;
        this.licenceDrive = licenceDrive;
    }

    public HumanDriver getHuman() {
        return human;
    }

    public void setHuman(HumanDriver human) {
        this.human = human;
    }

    public DriverLicenceDriver getLicenceDrive() {
        return licenceDrive;
    }

    public void setLicenceDrive(DriverLicenceDriver licenceDrive) {
        this.licenceDrive = licenceDrive;
    }

    @Override
    public String toString(){
        return "Driver{human=" + human +
                ",licence=" + licenceDrive + "}";
    }
}
