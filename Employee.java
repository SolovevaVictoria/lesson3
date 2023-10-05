package ru.geekbrains.lesson3;

/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */

    protected Integer age;

    /**
     * Возраст
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    public Employee(String surName, String name, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int ageRes = Integer.compare(this.age, o.age);
        if (ageRes == 0) {
            int surNameRes = surName.compareTo(o.surName);
            if (surNameRes == 0) {
                return name.compareTo(o.name);
            }
            return surNameRes;
        }
        return ageRes;
    }

}
