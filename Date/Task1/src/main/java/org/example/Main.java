package org.example;

/*
Создайте объект класса LocalDate, указывая дату своего рождения.
Вывести на консоль день недели, день в году, месяц, год.
Создайте  объект класса LocalDate, представляющий текущее время.
Сравните его со своим днем рождения используя методы isAfter(), isBefore().
 */

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*
        Date birthday = new Date(87,00, 02);
        System.out.println(birthday);
        Date current = new Date();
        System.out.println(current);
        System.out.println(birthday.after(current));
        System.out.println(birthday.before(current));
         */
        LocalDate birthday = LocalDate.of(2023, 9, 03);
        System.out.println(birthday);
        System.out.println(birthday.getDayOfYear());
        System.out.println(birthday.getDayOfWeek());

        Date now = new Date();
        System.out.println(birthday.isAfter(LocalDate.now()));
        System.out.println(birthday.isBefore(LocalDate.now()));
    }
}