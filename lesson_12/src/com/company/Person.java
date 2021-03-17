package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

// Написать класс Person, у которого есть следующие поля:
//         - Фамилия, Имя, Отчество, дата рождения.
//         Написать конструкторы:
//         - на все поля,
//         - только на ФИО
//         - который принимает 1 параметр - строку с полным именем "Иванов Иван Иванович", и задает отдельные значения в поля Фамилия, Имя, Отчество.
//            Написать методы:
//         - который возвращает полное ФИО типа "Иванов Иван Иванович"
//         - краткое ФИО типа "Иванов И. И."
public class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String dateBirthday;
    private String fio;
    Calendar calendar = Calendar.getInstance();


    public Person(String fio) {
        this.fio = fio;
        String[] arrFio = fio.split("\s");
        this.surname = arrFio[0];
        this.name = arrFio[1];
        this.patronymic = arrFio[2];
    }

    public Person(String name, String surname, String patronymic, String dateBirthday) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateBirthday = dateBirthday;
    }

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return surname + " " + name + " " + patronymic;
    }

    public String getShortFio() {
        return surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".";
    }

    public long getFullYears() {
        String[] arrBirthday = dateBirthday.split("\\.");
        LocalDate birthdate = LocalDate.of(Integer.parseInt(arrBirthday[2]), Integer.parseInt(arrBirthday[1]), Integer.parseInt(arrBirthday[0]));
        LocalDate now = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
        return ChronoUnit.YEARS.between(birthdate, now);
    }
}
