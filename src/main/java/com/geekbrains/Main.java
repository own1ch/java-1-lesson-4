package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        System.out.println(leapYear(1765));
    }

    private static boolean leapYear(int year) {
        //Считаем вискосный ли год
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
