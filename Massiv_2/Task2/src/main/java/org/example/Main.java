package org.example;

/*
Создайте массив из всех нечётных чисел от 1 до 10,
выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
но в обратном порядке (9, 7, 5, 3, 1).
 */


public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if(array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] % 2 !=0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}


