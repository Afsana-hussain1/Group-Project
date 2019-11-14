package com.example.motoinventoryservice.model;

import java.util.Objects;

public class Vehicle {
    private String vin;
    private String type;
    private String make;
    private String model;
    private String year;
    private String color;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(getVin(), vehicle.getVin()) &&
                Objects.equals(getType(), vehicle.getType()) &&
                Objects.equals(getMake(), vehicle.getMake()) &&
                Objects.equals(getModel(), vehicle.getModel()) &&
                Objects.equals(getYear(), vehicle.getYear()) &&
                Objects.equals(getColor(), vehicle.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVin(), getType(), getMake(), getModel(), getYear(), getColor());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}