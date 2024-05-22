package org.example;

import java.util.Scanner;

public class Employee {
    int number;
    static String telephone;
    static String name;
    static int stage;

    public Employee(int number, String telephone, String name, int stage) {
        this.number = number;
        Employee.telephone = telephone;
        Employee.name = name;
        Employee.stage = stage;
    }


    public static int search() {
        System.out.println("Введите стаж");
        Scanner scanner = new Scanner(System.in);
        int searchStage = scanner.nextInt();
        if(stage == searchStage) {
            System.out.println(name);
        }
        return searchStage;
    }

    public int getNumber() {
        return number;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getName() {
        return name;
    }

    public int getStage() {
        return stage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", telephone='" + telephone + '\'' +
                ", name='" + name + '\'' +
                ", stage=" + stage +
                '}';
    }
}

