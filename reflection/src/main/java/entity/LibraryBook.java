package entity;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * LibraryBook
 * created on 18.12.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class LibraryBook extends Book implements Serializable{

    private String inventoryNumber;
    private String takenBy;

    public LibraryBook(String name, String author, LocalDate publishDate, Integer publishedAmount,
                       Integer pages, String inventoryNumber, String takenBy) {
        super(name, author, publishDate, publishedAmount, pages);
        this.inventoryNumber = inventoryNumber;
        this.takenBy = takenBy;
    }

    public String getInventoryNumber() {

        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getTakenBy() {
        return takenBy;
    }

    public void setTakenBy(String takenBy) {
        this.takenBy = takenBy;
    }

    @Override
    @Invoke
    public String toString() {
        return "LibraryBook{" +
                "inventoryNumber='" + inventoryNumber + '\'' +
                ", takenBy='" + takenBy + '\'' +
                '}';
    }

    @Invoke
    public void makeReturned() {
        System.out.println("Book was returned by " + takenBy);
        takenBy = "";
    }
}
