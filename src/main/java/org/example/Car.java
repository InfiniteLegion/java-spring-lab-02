package org.example;

public class Car {
    private Brand brand;
    private String model;
    private String color;

    public Car() {}

    public Car(Brand brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        System.out.println("Class car - setBrand");
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        System.out.println("Class car - setColor");
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        System.out.println("Class car - setModel");
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand.getName() +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
