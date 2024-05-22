package org.example;

/*
Создать приложение с вложенностью пакетов не менее 3х, где будет класс для входа и несколько классов с логикой.
Пример: приложение для внесения заметок во внешний файл с обязательной фиксацией времени
пример:
Введите заметку: Hello, world!
Дозапись в файл: 16.07.2023 -> Hello, world
Скомпилируйте и запустите посредством CLI
 */

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("select" + "\n1 create an entry" + "\n2 open the entry");
        Menu.menu();
    }
}