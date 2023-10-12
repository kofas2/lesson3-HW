package ru.geekbrains.lesson3;

/**
 * TODO: Разработать тип Freelancer самостоятельно в рамках выполнения
 *  домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {
    private double hourlyRate;

    public Freelancer(String surName, String name, double hourlyRate, int age) {
        super(surName, name, 0, age);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата: %.2f (руб.); Возраст: %d лет",
                surName, name, calculateSalary(), age);
    }
}
