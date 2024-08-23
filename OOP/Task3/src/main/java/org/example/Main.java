package org.example;

/*
Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
ФИО,
номер читательского билета,
факультет,
дата рождения,
телефон.
Методы takeBook(), returnBook().
Разработать программу, в которой создается массив объектов данного класса.
Перегрузить методы takeBook(), returnBook():
- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
 */

public class Main {
        static void userBook(int... book ) {
        System.out.println("Количество: ");
        for(int a : book) {
            System.out.println(a + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

            userBook();
            userBook(1);
            userBook(1, 2);
            userBook(new int[]{1, 3});
        Reader[] array = new Reader[5];
        for(int i = 0; i < 5; i++) {
            array[i] = new Reader();
        }
        }
    }
