package org.example;

public class Apple extends Fruit {

    public Apple(double weight, double price) {
        super(weight, price);
    }

    @Override
    public double getPrice() {
        return (price * 189) * (weight * 1.2);
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
