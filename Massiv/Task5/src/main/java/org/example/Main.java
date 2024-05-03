package org.example;

import java.util.Random;

/*Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
Распечатать массив, содержащий максимальное и минимальное значение.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}