package org.example;

/*
Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
чтобы он мог поднять заработную плату всем, кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Kirill", 29, 50000, LocalDate.parse("2021-11-15")));
        employee.add(new Employee("Nika", 25, 40000, LocalDate.parse("2021-08-15")));
        employee.add(new Supervisor("Dmitrii", 32, 65000, LocalDate.parse("2007-03-01"), "manager"));

        employee.sort(new EmployeeComparator());

        Supervisor.increaseSalary(employee, 20);
        for(Employee employees: employee) {
            System.out.println(employees);
        }
    }
}