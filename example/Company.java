package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Company {

    private static  Random random = new Random();
    private String companyName;
    private ArrayList<Vacancy> vacancies;
    private  double maxSalary;

    private Publisher jobAgency;


    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        this.vacancies = new ArrayList<>();
    }


    public void createVacancy(String name) {
        double salary = random.nextDouble(3000, maxSalary);
        Vacancy newvacancy = new Vacancy(name, salary);
        vacancies.add(newvacancy);
        jobAgency.sendOffer(companyName, newvacancy);
    }

}
