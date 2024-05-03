package org.example;

/*
Создайте класс Phone, который содержит переменные number, model и weight. v
Создайте три экземпляра этого класса. v
Выведите на консоль значения их переменных. v
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. v
Выводит на консоль сообщение “Звонит {name}”. v
Метод getNumber – возвращает номер телефона. v
Вызвать эти методы для каждого из объектов. v
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса:
number, model и weight. v
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model. v
Добавить конструктор без параметров. v
Вызвать из конструктора с тремя параметрами конструктор с двумя. v
Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. v
Вызвать этот метод. v
Создать метод sendMessage с аргументами переменной длины.
Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
Изменить класс Phone в соответствии с концепцией JavaBean.
 */
public class Main {
    public static void main(String[] args) {
// Создайте три экземпляра этого класса. v
// Выведите на консоль значения их переменных.
        Phone nokia = new Phone(16, "A21", 129);
        System.out.println("number: " + nokia.number + " model: " + nokia.model +
                " weight: " + nokia.weight);
        System.out.println(nokia.receiveCall("звонит Kirill") + " " + nokia.getNumber());
        System.out.println(nokia.receiveCall("Nika" + " " + 18));
        System.out.println(nokia.sendMessage("27"));

        Phone motorola = new Phone(25, "E118", 110);
        System.out.println("number: " + motorola.number + " model: " + motorola.model +
                " weight: " + motorola.weight);
        System.out.println(motorola.receiveCall("звонит Alex") + " " + motorola.getNumber());
        System.out.println(motorola.receiveCall("Marina" + " " + 20));
        System.out.println(motorola.sendMessage("29"));

        Phone lg = new Phone(39, "L516", 109);
        System.out.println("number: " + lg.number + " model: " + lg.model +
                " weight: " + lg.weight);
        System.out.println(lg.receiveCall("звонит Michail") + " " + lg.getNumber());
        System.out.println(lg.receiveCall("Nasty" + " " + 20));
        System.out.println(lg.sendMessage("36"));
    }
}