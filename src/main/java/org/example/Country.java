package org.example;

public class Country {
    private String name;
    private double population;

    public Country() {}

    public Country(String name, double population) {
        System.out.println("Class country - constructor");
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class country - setName");
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        System.out.println("Class country - setPopulation");
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
