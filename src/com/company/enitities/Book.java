package com.company.enitities;

import java.util.Objects;

public class Book extends Product{

    private String publisher;
    private int yearPublished;

    /** Creates a new instance of Book */
    public Book(double regularPrice,
                String publisher,
                int yearPublished) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.5;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublished == book.yearPublished && publisher.equals(book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisher, yearPublished);
    }
}
