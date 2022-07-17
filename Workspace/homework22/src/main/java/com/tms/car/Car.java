package com.tms.car;

public class Car {
    private int id;
    private String brand;

    public Car(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
