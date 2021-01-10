package com.company.enitities;

import java.util.Objects;

public class TV extends Electronics {

    int size;

    /** Creates a new instance of TV */
    public TV(double regularPrice,
              String manufacturer,
              int size) {
        super(regularPrice, manufacturer);
        this.size = size;
    }

    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.8;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return size == tv.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}



