package ru.geekbrains.lesson3;

/**
 * TODO: Разработать тип Freelancer самостоятельно в рамках выполнения
 *  домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee{

    int hours;
    static double koef = 20.8;

    /*
    * Фрилансер инициализируется дополнительно с количеством
    * отработанных часов, или без них (тогда часы = 0)
    */
    public Freelancer(String surName, String name, double salary, int age) {
        this(surName, name, salary, age, 0);
    }
    public Freelancer(String surName, String name, double salary, int age, int hours) {
        super(surName, name, salary, age);
        this.hours = hours;
    }

    public void setHours(int hours){this.hours = hours;}

    public int getHours() { return hours;}

    /*
    Добавить часы работнику
     */
    public void addHours(int hours) {this.hours = this.hours + hours;}


    @Override
    public double calculateSalary() {
        return this.salary * 8 * koef;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст - %d; Среднемесячная заработная плата : %.2f (руб.)",
                surName, name, age, this.calculateSalary());
    }


}
