package org.example;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov", "Analyst");
        Master petrov = new Master("Petrov", "Programmer");
        Student sidorov = new Student("Sidorov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);

        for (int i = 0; i < 5; i++){
            geekBrains.createVacancy("Teacher");
            google.createVacancy("Analyst");
            yandex.createVacancy("Programmer");
        }
    }

}
