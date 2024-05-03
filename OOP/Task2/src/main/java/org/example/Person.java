package org.example;

public class Person {
    String fullName;
    int age;

    public void move() {
        System.out.println("Hello");
    }

    public void talk() {
        System.out.println("Hi");
    }
/*
    public static String move (String Hello) {
        return Hello;
    }
    public static String talk (String hi) {
        return hi;
    }
*/

    String move = "Hello";
    String talk = "Hi";


    public Person() {
        fullName = "Kirill";
        age = 30;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

}
