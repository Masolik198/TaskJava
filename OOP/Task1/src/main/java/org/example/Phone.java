package org.example;

// Создайте класс Phone, который содержит переменные number, model и weight.
public class Phone {
    int number;
    String model;
    int weight;

// Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
// Выводит на консоль сообщение “Звонит {name}”.
// Вызвать эти методы для каждого из объектов.
    public String receiveCall(String name) {
        return name;
    }
// Метод getNumber – возвращает номер телефона.
// Вызвать эти методы для каждого из объектов.
    public int getNumber() {
        return number;
    }
// Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса:
// number, model и weight.
// Вызвать из конструктора с тремя параметрами конструктор с двумя.
    public Phone(int number, String model, int weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
// Добавить конструктор, который принимает на вход два параметра для
// инициализации переменных класса - number, model.
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

// Добавить конструктор без параметров.
    public Phone() {
    }
// Добавьте перегруженный метод receiveCall, который принимает два параметра:
// имя звонящего и номер телефона звонящего. Вызвать этот метод.
    public String receiveCall(String callName, int callNumber) {
        return callName + callNumber;
    }
// Создать метод sendMessage с аргументами переменной длины.
// Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
// Метод выводит на консоль номера этих телефонов.
    public boolean sendMessage(String... numbers) {
        for (String number: numbers) {
            System.out.println("отправляется сообщение на номер" + " " + number);
        }
        return true;
    }
}
