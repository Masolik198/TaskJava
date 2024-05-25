package org.example;

import java.util.Random;

/*Создать двумерный массив 3х4 типа int и инициализировать его с помощью блока для инициализации.
Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
Распечатать массив, содержащий максимальное и минимальное значение.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            int max = array[i][0];
            int min = array[i][0];
            for (int j = 0; j < array.length; j++) {
                if(max < array[i][j])
                    max = array[i][j];
                if(min > array[i][j])
                    min = array[i][j];
            }
            System.out.print(max + " " + min + "\n");
        }
    }
}