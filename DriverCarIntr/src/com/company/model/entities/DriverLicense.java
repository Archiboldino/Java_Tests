package com.company.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 25.01.2016.
 */
public class DriverLicense implements DriverLicenceDriver{
    private HumanDriverLicence name;

    public enum Category { A,B,C,D,E}
    private List<Category> categories = new ArrayList<Category>();

    private LocalDate fromDate;
    private LocalDate expires;

    public DriverLicense() {
    }

    public DriverLicense(HumanDriverLicence name, LocalDate expires, List<Category> categories, LocalDate fromDate) {
        this.name = name;
        this.expires = expires;
        this.categories = categories;
        this.fromDate = fromDate;
    }
    public DriverLicense(HumanDriverLicence name, LocalDate expires, Category category, LocalDate fromDate) {
        this.name = name;
        this.expires = expires;
        this.categories.add( category );
        this.fromDate = fromDate;
    }

    @Override
    public List<Category> category() {
        return categories;
    }

    @Override
    public LocalDate fromDate() {
        return fromDate;
    }

    @Override
    public LocalDate expires() {
        return expires;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getExpires() {
        return expires;
    }

    public void setExpires(LocalDate expires) {
        this.expires = expires;
    }

    @Override
    public String toString() {
        return "DriverLicense{" +
                "categories=" + categories +
                ", fromDate=" + fromDate +
                ", expires=" + expires +
                '}';
    }
}
