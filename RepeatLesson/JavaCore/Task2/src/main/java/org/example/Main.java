package org.example;

/*
Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        for(int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(1, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println(Count.getArr(arr));
        System.out.println(Difference.difference(arr));
        System.out.println(Zero.zero(arr));
    }
}