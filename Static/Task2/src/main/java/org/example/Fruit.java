package org.example;

public abstract class Fruit {
    public double weight;
    public double price;

    public Fruit(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    void printManufacturerInfo() {
        System.out.println("Made in Russia");
    }

    public abstract double getPrice();

    abstract double getprice();

    public double getWeight() {
        return weight;
    }
}
