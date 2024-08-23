package org.example;

/*
Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
Для вычисления модуля используйте тернарную условную операцию.
Для ввода чисел используем класс Scanner.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        int a, b, c, num;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        num = (a < b && a < c) ? a : ((b < a && b < c) ? b : c);
        System.out.println(num);
    }
}