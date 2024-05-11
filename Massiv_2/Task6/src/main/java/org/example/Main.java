package org.example;

import java.util.Random;

/*
Создайте массив из 4 случайных целых чисел из отрезка [10;99].
Выведите его на экран в строку.
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class Main {
    Random random = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 100);
            System.out.print(array[i] + " ");
        }
        for(int i = 0; i < array.length; i++) {
            if(i > 0) {
                if(array[i - 1] > array[i]) {
                    System.out.println("Progressiv is not");
                    break;
                }
            }
            if(i == args.length - 1) {
                System.out.println("yes");
            }
        }
    }
}
