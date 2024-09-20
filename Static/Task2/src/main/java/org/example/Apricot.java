package org.example;

public class Apricot extends Fruit {

    public Apricot(double weight, double price) {
        super(weight, price);
    }

    @Override
    public double getPrice() {
        return (price * 170) * (weight * 0.88);
    }

    @Override
    double getprice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
