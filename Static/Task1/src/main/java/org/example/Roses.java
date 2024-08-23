package org.example;

public class Roses extends Flower{
    String country;
    int srok;
    int price;

    public Roses(String country, int srok, int price) {
        super(country, srok, price);
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public int getSrok() {
        return srok * 3;
    }
    @Override
    public int getPrice() {
        return price * 15;
    }
}
