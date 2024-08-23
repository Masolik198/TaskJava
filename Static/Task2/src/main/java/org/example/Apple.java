package org.example;

public class Apple extends Fruit{

    public Apple(int weight, int price) {
        super(weight, price);
    }

    @Override
    public int getPrice() {
        return (price * 180) * (weight * 2);
    }

    @Override
    int getprice() {
        return price;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
