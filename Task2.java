package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    static Random random = new Random();

    static Employee generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(10000, 100000);
        int age = random.nextInt(20, 70);
        Employee worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
        return worker;
    }

    static Employee generateFreelancer(){
        String[] names = new String[] { "Викор", "Григорий", "Юлий", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Васильев", "Фокин", "Соловьев", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(1000, 5000);
        int age = random.nextInt(20, 70);
        int hours = random.nextInt(40);
        Employee freelancer = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age, hours);
        return freelancer;
    }

    /**
     * TODO: Переработать метод generateEmployees. Метод должен возвращать массив сотрудников
     *  разных типов (Worker, Freelancer), метод должен быть ОДИН!
     * @param count
     * @return
     */
    static Employee[] generateEmployees(int count){
        int j;
        Employee[] employees = new Employee[count];
        for (int i = 0; i < employees.length; i++) {
            j = random.nextInt(2);
            employees[i] = j == 0 ? generateWorker() : generateFreelancer();
        }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(15);

        Arrays.sort(employees);
        /*
        Сортировка в порядке приоритета: 1) возраст 2) фамилия 3) имя
         */
        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();
        /*
        по возрасту
         */
        Arrays.sort(employees, new SalaryComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

}
