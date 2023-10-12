package ru.geekbrains.lesson3;

/**
 * Рабочий (фулл-тайм)
 */
public class Worker extends Employee {
    

    public Worker(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
        this.age = age;
    }


    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная): %.2f (руб.); Возраст: %d лет",
                surName, name, calculateSalary(), age);
    }
}
