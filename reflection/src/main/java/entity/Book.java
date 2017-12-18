package entity;

import java.time.LocalDate;

/**
 * Book
 * created on 18.12.2017
 *
 * @author Nikita Zabaykin vladlihovid@gmail.com
 * @version 1.0
 */
public class Book {
    private String name;
    private String author;
    private LocalDate publishDate;
    private Integer publishedAmount;
    private Integer pages;

    public Book(String name, String author, LocalDate publishDate, Integer publishedAmount, Integer pages) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
        this.publishedAmount = publishedAmount;
        this.pages = pages;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public Integer getPublishedAmount() {
        return publishedAmount;
    }

    public void setPublishedAmount(Integer publishedAmount) {
        this.publishedAmount = publishedAmount;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishDate=" + publishDate +
                ", publishedAmount=" + publishedAmount +
                ", pages=" + pages +
                '}';
    }
}
