package org.example;

public class Flower {
    public String country;
    public int srok;
    public int price;

    public Flower(String country, int srok, int price) {
        this.country = country;
        this.srok = srok;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }
    public int getSrok() {
        return srok;
    }
    public int getPrice() {
        return price;
    }
}
