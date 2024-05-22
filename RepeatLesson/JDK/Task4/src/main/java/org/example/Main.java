package org.example;

/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
- Табельный номер
- Номер телефона
- Имя
- Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(7, "895238571", "Oksana", 9));
        employee.add(new Employee(8, "895226483", "Kirill", 4));
        employee.add(new Employee(5, "892135062", "Dmitrii", 8));
        employee.add(new Employee(2, "892135858", "Marina", 7));

        Menu.menu();
    }
}