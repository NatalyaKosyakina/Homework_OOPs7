package org.example;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();
    private String name;

    private double minSalary;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(2000, 4000);
    }

    @Override
    public void receiveOffer(String companyName, Vacancy newvacancy) {
        if (minSalary <= newvacancy.getMaxSalary()){
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа! [%s - %f]\n",
                    name, minSalary, companyName, newvacancy.getMaxSalary());
            minSalary = newvacancy.getMaxSalary();
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, newvacancy.getMaxSalary());
        }
    }
}
