package org.example;
/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
Выведите массивы на экран в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите,
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double average = 0;
        double average2 = 0;
        double maxAverage;
        Random random = new Random();
        int[] array = new int[5];
        int[] array2 = new int[5];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }

        for(int i = 0; i < array.length; i++) {
            average = array[i] + average;
            }
        average = average / 2;
        System.out.print("\n" + average);

        System.out.println();
        for(int j = 0; j < array2.length; j++) {
            array2[j] = random.nextInt(15);
            System.out.print(array2[j] + " ");
        }
        for(int j = 0; j < array2.length; j++) {
            average2 = array2[j] + average2;
        }
        average2 = average2 / 2;
        System.out.println("\n" + average2);

        if(average > average2) {
            maxAverage = average;
        }
        else maxAverage = average2;
        System.out.println(maxAverage);
        if (average == average2) {
            System.out.println("равны");
        }
    }
}