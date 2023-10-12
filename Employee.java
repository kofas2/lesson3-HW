package ru.geekbrains.lesson3;

/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String surName;
    protected double salary;
    protected int age; // Добавляем поле "возраст"

    public Employee(String surName, String name, double salary, int age) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age; // Геттер для возраста
    }
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
