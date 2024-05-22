package org.example;

import java.util.Scanner;

public class Menu extends Main{
    public static void menu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                Writer.writer();
                case 2:
                Read.read();
        }
    }
}
