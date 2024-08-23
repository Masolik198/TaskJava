package org.example;

public abstract class Fruit {
    public int weight;
    public int price;

    public Fruit(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    void printManufacturerInfo() {
        System.out.println("Made in Russia");
    }

    public abstract int getPrice();

    abstract int getprice();

    public int getWeight() {
        return weight;
    }
}
