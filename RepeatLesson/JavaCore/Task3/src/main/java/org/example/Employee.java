package org.example;
import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
    String name;
    int age;
    int salary;
    LocalDate date;

    public Employee(String name, int age, int salary, LocalDate date) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.date = date;
    }

    @Override
    public int compareTo(Employee o) {
        return this.date.compareTo(o.date);
    }

    public LocalDate getDate() {
        return date;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}
