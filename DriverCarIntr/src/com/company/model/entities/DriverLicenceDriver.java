package com.company.model.entities;

import java.time.LocalDate;
import java.util.List;

/**
 * DriverLicenceDriver
 * created on 14.11.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public interface DriverLicenceDriver {
    List<DriverLicense.Category> category();
    LocalDate fromDate();
    LocalDate expires();
}
