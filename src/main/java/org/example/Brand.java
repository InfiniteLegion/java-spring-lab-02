package org.example;

public class Brand {
    private String name;
    private Country country;

    public Brand() {}

    public Brand(String name, Country country) {
        System.out.println("Class brand - constructor");
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Class brand - setName");
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        System.out.println("Class brand - setCountry");
        this.country = country;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", country=" + country.getName() +
                '}';
    }
}
