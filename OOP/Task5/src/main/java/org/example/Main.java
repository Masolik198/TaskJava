package org.example;
/*
Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 4 или 5, то сумма 2000 грн, иначе 1900.
Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 4 или 5, то сумма 2500 руб, иначе 2200.
Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.

 */

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.mark());
        System.out.println(student.getScholarship());
    }
}