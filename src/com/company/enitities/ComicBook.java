package com.company.enitities;

import java.util.Objects;

public class ComicBook extends Book{
    private String characterName;

    public ComicBook(double regularPrice, String publisher, int yearPublished, String characterName) {
        super(regularPrice, publisher, yearPublished);
        this.characterName = characterName;
    }

    @Override
    public double computeSalePrice() {
        return super.computeSalePrice() * 0.6;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComicBook comicBook = (ComicBook) o;
        return characterName.equals(comicBook.characterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterName);
    }
}
