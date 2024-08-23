package org.example;

/*
Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нет.
Ввод числа осуществлять с помощью класса Scanner.
Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner number = new Scanner(System.in);

        if(number.hasNextInt()) {
            if(number.nextInt() % 2 == 0 ) {
                System.out.println("Число чётное");
            }
            else
                System.out.println("Число не чётное");
        }
        else
            System.out.println("Ошибка, Вы ввели не целое число");
    }
}