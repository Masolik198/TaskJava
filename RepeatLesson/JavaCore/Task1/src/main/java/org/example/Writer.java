package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Writer extends Menu{
    public static void writer() throws IOException {
        System.out.println("Enter the name");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        FileWriter writer = new FileWriter("res.txt", true);
        LocalDateTime date = LocalDateTime.now();
        writer.append(a + "\t" + date);
        System.out.println("entry create");
        writer.close();
    }
}
