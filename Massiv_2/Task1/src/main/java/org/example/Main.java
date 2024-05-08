package org.example;

/*
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
Перед созданием массива подумайте, какого он будет размера.
 */

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if(array[i] % 2 == 0 ) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if(array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}