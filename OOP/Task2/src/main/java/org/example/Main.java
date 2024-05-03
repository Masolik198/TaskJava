package org.example;

/*
Создать класс Person, который содержит:
переменные fullName, age;
методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
Добавьте два конструктора  - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
Вызовите методы move() и talk().
 */

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person Nika = new Person("Nika", 29);

        System.out.println(person.fullName + " " + person.age + " age, " + "say: " + person.move);
        System.out.println(Nika.fullName + " " + Nika.age + " age, " + "say: " + Nika.talk);

        try {
            Method method = person.getClass().getMethod("move");
            method.invoke(person);
            Method method1 = person.getClass().getMethod("talk");
            method1.invoke(person);
        }catch (Exception e) {
            System.out.println("метод не найден");
        }
    }
}