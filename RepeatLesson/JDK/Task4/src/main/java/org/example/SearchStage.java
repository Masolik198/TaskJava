package org.example;

import java.util.Scanner;

import static org.example.Employee.name;
import static org.example.Employee.stage;

public class SearchStage {
    public static void searchStage() {
        System.out.println("Ведите стаж");
        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();
        if(stage == search) {
            System.out.println(name);
        }
    }
}
