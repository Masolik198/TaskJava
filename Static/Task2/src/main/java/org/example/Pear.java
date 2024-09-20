package org.example;

public class Pear extends Fruit {

    public Pear(double weight, double price) {
        super(weight, price);
    }

    @Override
    public double getPrice() {
        return (price * 280) * (weight * 0.4);
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
