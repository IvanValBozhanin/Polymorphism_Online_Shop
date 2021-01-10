package com.company.enitities;

import java.util.Objects;

public class MP3Player extends Electronics{

    private String color;

    /**
     * Creates a new instance of MP3Player
     */
    public MP3Player(double regularPrice,
                     String manufacturer,
                     String color) {
        super(regularPrice, manufacturer);
        this.color = color;
    }

    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.9;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MP3Player mp3Player = (MP3Player) o;
        return color.equals(mp3Player.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
