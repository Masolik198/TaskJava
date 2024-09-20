package org.example;
/*
Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
Класс Фрукт содержит:
а) переменную вес,
б) завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
Метод должен учитывать вес фрукта.
Создать несколько объектов разных классов.
Подсчитать общую стоимость проданных фруктов.
А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */

public class Main {
    public static void main(String[] args) {
        double weight = 1;
        double price = 1;

        Fruit apple = new Apple(weight, price);
        Fruit pear = new Pear(weight, price);
        Fruit apricot = new Apricot(weight, price);

        Fruit basket1 = (apple);
        Fruit basket2 = (pear);
        Fruit basket3 = (apricot);

        apple.printManufacturerInfo();
        System.out.println(basket1.getPrice());
        System.out.println(basket2.getPrice());
        System.out.println(basket3.getPrice());
        System.out.println(basket1.getPrice() + basket2.getPrice() + basket3.getPrice());
    }
}