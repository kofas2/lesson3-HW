package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {

    static Random random = new Random();

    // Массивы имен и фамилий
    static String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
    static String[] surnames = new String[] { "Григорьев", "Фокин", "Shut up and dance", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

    static Worker generateWorker() {
        int salary = random.nextInt(50000, 110000);
        int age = random.nextInt(18, 60); // Генерация случайного возраста
        Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
        return worker;
    }

    public static Employee generateEmployee() {
        int age = random.nextInt(18, 60); // Генерация случайного возраста
        List<Class<? extends Employee>> employeeClasses = new ArrayList<>();
        employeeClasses.add(Worker.class);
        employeeClasses.add(Freelancer.class);

        Class<? extends Employee> randomEmployeeClass = employeeClasses.get(random.nextInt(employeeClasses.size()));

        if (randomEmployeeClass.equals(Worker.class)) {
            int salary = random.nextInt(50000, 110000);
            return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
        } else if (randomEmployeeClass.equals(Freelancer.class)) {
            double hourlyRate = random.nextDouble(20, 50); // Пример почасовой ставки
            return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], hourlyRate, age);
        }

        return null; // Возврат null, если не удалось создать сотрудника
    }

    public static void main(String[] args) {
        int count = 15;
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            employees.add(generateEmployee());
        }

        employees.sort(new AgeComparator()); // Сортировка по возрасту

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}


