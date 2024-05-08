package org.example;
/*

Random random = new Random();
int[] array = new int[15];
for(int i = 0; i < array.length; i++) {
array[i] = random.nextInt(15);
System.out.print(array[i] + " ");
if(array[i] % 2 == 0) {
System.out.print(array[i] + " ");
}
*/

/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9].
Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */
public class Main {
    public static void main(String[] args) {
        int positiveNumber = 0;
        int[] array = new int[15];
        for(int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0 & array[i] % 2 == 0)
            positiveNumber++;
            }
            System.out.println("Всего чётных чисел в массиве: " + positiveNumber);
        }
    }


