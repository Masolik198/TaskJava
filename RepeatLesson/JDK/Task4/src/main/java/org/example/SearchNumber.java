package org.example;

import java.util.Objects;
import java.util.Scanner;

import static org.example.Employee.name;

import static org.example.Employee.telephone;

public class SearchNumber {
    public static void searchNumber() {
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        if(Objects.equals(name, search)) {
            System.out.println(telephone);
        }
    }
}
