package org.example;

import java.util.Random;

/*
Создать двумерный массив типа char размером 4х2.
Записать в него значения с помощью блока для инициализации.
Распечатать значения массива.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        char[][] array = new char[4][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                array[i] = new char[]{(char) (random.nextInt(26) + 'a')};
                array[j] = new char[]{(char) (random.nextInt(26) + 'a')};
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }
}

