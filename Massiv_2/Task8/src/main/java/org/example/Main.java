package org.example;

/*
Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-15, 16);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0], index = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.print("Максимальный элемент: " + max + " " + "с индексом: " + index + " ");
    }
}