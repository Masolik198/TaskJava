package org.example;

/*
Создать класс "Матрица". Класс должен иметь следующие переменные:

двумерный массив вещественных чисел;
количество строк и столбцов в матрице.
Класс должен иметь следующие методы:

сложение с другой матрицей;
умножение на число;
вывод на печать;
умножение матриц.
 */

public class Main {
    public static void main(String[] args) {
        int[][] array = {{5, 6, 7}, {2, 4, 3}};
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        int[][] array2 = {{2, 4, 3}, {5, 6, 7}};
        System.out.println(array2.length);
        for (int k = 0; k < array.length; k++) {
            for (int m = 0; m < 3; m++) {
                System.out.print(array2[k][m]);
            }
            System.out.println();
        }
    }
}