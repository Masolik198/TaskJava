
package org.example;

import java.util.Scanner;

import static org.example.SearchNumber.searchNumber;
import static org.example.SearchStage.searchStage;

public class Menu {
    public static void menu() {
        System.out.println("Выберите пункт меню: " + "\n" + "1 - поиск по стажу" + "\n" + "2 - поиск телефона по имени" +
                "\n" + "3 - поиск по табельному номеру");
        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();

        switch (search) {
            case(1):
                searchStage();
                break;
            case(2):
                searchNumber();
                break;
            case(3):
                //searchTabNumber();
                break;
        }
    }
}
