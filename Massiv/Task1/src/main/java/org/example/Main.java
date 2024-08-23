package org.example;
/*
Создать массив типа String с размером 7.
Записать в него значения дней недели.
Вывести на консоль значение последнего элемента.
 */
public class Main {
    public static void main(String[] args) {
        String[] weekDay = new String[7];
        weekDay[0] = "Monday";
        weekDay[1] = "Tuesday";
        weekDay[2] = "Wednesday";
        weekDay[3] = "Thursday";
        weekDay[4] = "Friday";
        weekDay[5] = "Satuday";
        weekDay[6] = "Sanday";
        System.out.println(weekDay[6]);
    }
}
