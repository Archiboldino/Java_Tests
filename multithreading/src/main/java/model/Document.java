package model;

/**
 * Document
 * created on 12.12.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Document {
    private String name;
    private String speciality;

    public Document(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Document() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
