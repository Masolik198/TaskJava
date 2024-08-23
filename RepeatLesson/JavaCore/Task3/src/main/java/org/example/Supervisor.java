package org.example;

import java.time.LocalDate;
import java.util.List;

public class Supervisor extends Employee{
    String jobTitle;
    public Supervisor(String name, int age, int salary, LocalDate date, String jobTitle) {
        super(name, age, salary, date);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Функция повышения зарплаты
     * @param employees это сотрудник
     * @param def это на сколько повышаем
     */
    public static void increaseSalary(List<Employee> employees, int def) {
        for(Employee employee: employees) {
            if(!(employee instanceof Supervisor)) {
                int currentSalary = employee.getSalary();
                employee.setSalary((currentSalary + def));
            }
        }
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", date=" + date +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
