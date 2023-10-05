package ru.geekbrains.lesson3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {


    private SortType sortType;

    public SalaryComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {

        return sortType == SortType.Ascending ? Integer.compare(o1.age, o2.age) :
                Integer.compare(o2.age, o1.age);
    }
}
