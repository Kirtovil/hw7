package com.company;

public class Main {

    public static void main(String[] args) {
//       задание 1
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("Имя сотрудника - " + fullName);

//        задание 2
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + fullName1);

//        задание 3
        String fullName2 = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для одменистративного отдела - " + fullName2);

//        задание 4
        String fullName3 = "Иван Семён Семёнович";
        fullName3 = fullName3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудник - " + fullName3);
    }
}
