package com.company.enitities;

import java.util.Objects;

public class ChildrenBook extends Book{
    private int age;

    /**
     * Creates a new instance of Book
     *
     * @param regularPrice
     * @param publisher
     * @param yearPublished
     */
    public ChildrenBook(double regularPrice, String publisher, int yearPublished, int age) {
        super(regularPrice, publisher, yearPublished);
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice() * 0.7;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildrenBook that = (ChildrenBook) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
