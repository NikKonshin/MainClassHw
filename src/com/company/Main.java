package com.company;

public class Main {

    public static void main(String[] args) {
        byte a = (byte) 8;
// Так же можно объявить и все остальные целочисленные перепенные short, int long.
// Отличие лишь в кол-ве символов.
        float b = 10.26f; // Это переменная с плавающей запятой.
        char s = 'r'; // Символьный.
        boolean e = true; // Логический.
        e = false;
        String c = "Code"; // Ссылочный.
        //Надеюсь я правильно понял это задание=)


        exampleSolution(3, 5, 6, 7);

        summOfNumber(2, 6);

        checkNumber(0);

        negativeNumber(5);

        greetingName("Никита");

        leapYear(163);
    }

    // Задание 3.
    public static double exampleSolution(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    // Задание 4.
    public static boolean summOfNumber(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 5.
    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // Задание 6.
    public static boolean negativeNumber(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 7.
    public static void greetingName(String a) {
        System.out.println("Привет, " + a + " =).");
    }


    // Задание *8.
    public static void leapYear(int a) {
        if (a >= 100 && a % 400 == 0 && a % 100 == 0) {
            System.out.println("Год високосный");
            return;
        }
        if (a >= 100 && a % 400 != 0 && a % 100 == 0) {
            System.out.println("Год не високосный");
            return;
        }
        if (a % 4 != 0) {
            System.out.println("Год не високосный");
            return;
        }
        if (a % 4 == 0) {
            System.out.println("Год високосный");
            return;
        }
    }

}