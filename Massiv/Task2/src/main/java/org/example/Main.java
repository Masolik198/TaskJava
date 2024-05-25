package org.example;

/*
Создать массив типа double с размером 4.
Записать в него любые значения с помощью блока для инициализации.
Вывести на консоль значение первого элемента.
 */
public class Main {
    public static void main(String[] args) {
        double[] array = new double[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2.5;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n" + array[0] + " печать первого элента");
    }
}
