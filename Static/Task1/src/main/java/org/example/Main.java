package org.example;
//https://github.com/wmansy/java-tasks-2/tree/main/src/lesson3/Flowers
/*
Создать класс Flower, который содержит переменные страна производитель, срок хранения в днях, цена.
Создать классы расширяющие класс Flower (для примера, пусть это будут розы, гвоздики, тюльпаны и... что-то на свой вкус).
Собрать 3 букета (используем массив) с определением их стоимости. В букет может входить несколько цветов разного типа.
Также подсчитать количество проданных цветов (используем статическую переменную).
 */

public class Main {
    public static void main(String[] args) {
        String country = "Russia";
        int srok = 5;
        int price = 100;

        Flower roses = new Roses(country, srok, price);
        Flower carnation = new Carnation(country, srok, price);

        Flower[] boquet1 = {roses, carnation, roses};
        Flower[] boquet2 = {carnation, roses, carnation};

        System.out.println(boquet1.length + boquet2.length);
    }
}