package org.example;

import java.util.Random;

public class Master implements Observer {
    private static Random random = new Random();

    private String name;
    private String profession;

    private double minSalary;

    public Master(String name, String profession) {
        this.name = name;
        minSalary = random.nextDouble(60000, 80000);
        this.profession = profession;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy newvacancy) {
        if ((newvacancy.getName().equals(profession)) && (minSalary <= newvacancy.getMaxSalary())){
            System.out.printf("Рабочий %s (%f) >>> Мне нужна эта работа! [%s - %f]\n",
                    name, minSalary, companyName, newvacancy.getMaxSalary());
            minSalary = newvacancy.getMaxSalary();
        }
        else {
            System.out.printf("Рабочий %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, companyName, newvacancy.getMaxSalary());
        }
    }

}
