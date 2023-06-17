package org.example;

import java.util.Random;

public class Vacancy {
    private static Random random = new Random();
    private String name;
    private String typeEmployee;

    private  double maxSalary;

    public String getName() {
        return name;
    }

    public double getMaxSalary() {
        return maxSalary;
    }


    public Vacancy(String name, double maxSalary){
        this.name = name;
        this.maxSalary = maxSalary;
    }


    public boolean equals(Vacancy obj) {
        return this.name.equals(obj.name);
    }
}
